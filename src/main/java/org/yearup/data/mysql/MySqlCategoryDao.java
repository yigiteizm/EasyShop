    package org.yearup.data.mysql;

    import org.springframework.stereotype.Component;
    import org.yearup.data.CategoryDao;
    import org.yearup.models.Category;

    import javax.sql.DataSource;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;

    @Component
    public class MySqlCategoryDao extends MySqlDaoBase implements CategoryDao
    {
        public MySqlCategoryDao(DataSource dataSource)
        {
            super(dataSource);
        }

        @Override
        public List<Category> getAllCategories() {
            List<Category> categories = new ArrayList<>();
            String sql = "SELECT * FROM categories";

            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    categories.add(mapRow(resultSet));
                }

            } catch (SQLException e) {
                throw new RuntimeException("Error retrieving categories", e);
            }

            return categories;
        }



        @Override
        public Category getById(int categoryId)
        {
            String sql = "SELECT * FROM categories WHERE category_id = ?";

            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setInt(1, categoryId);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return mapRow(resultSet);
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        public Category create(Category category) {
            String sql = "INSERT INTO categories (name, description) VALUES (?, ?)";

            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {


                statement.setString(1, category.getName());
                statement.setString(2, category.getDescription());


                int rowsAffected = statement.executeUpdate();
                if (rowsAffected == 0) {
                    throw new SQLException("Insert failed, no rows affected!");
                }


                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        category.setCategoryId(generatedKeys.getInt(1));
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            return category;
        }


        @Override
        public void update(int categoryId, Category category)
        {
            String sql = "UPDATE categories SET name = ?, description = ? WHERE category_id = ?";

            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, category.getName());
                statement.setString(2, category.getDescription());
                statement.setInt(3, categoryId);
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected == 0) {
                    throw new SQLException("Update failed, no rows affected!");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void delete(int categoryId)
        {
            String sql = "DELETE FROM categories WHERE category_id = ?";

            try (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, categoryId);
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected == 0) {
                    throw new SQLException("Delete failed, no rows affected!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        private Category mapRow(ResultSet row) throws SQLException
        {
            int categoryId = row.getInt("category_id");
            String name = row.getString("name");
            String description = row.getString("description");

            Category category = new Category()
            {{
                setCategoryId(categoryId);
                setName(name);
                setDescription(description);
            }};

            return category;
        }

    }
