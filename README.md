# Easy Shop E-Commerce Project

## Description of the Easy Shop Project
EasyShop Backend is a **RESTful API** for e-commerce, enabling admin management of categories and products, with secure role-based access. 
It supports product browsing for all users, designed for easy front-end integration.

### Admin Features Include:
- Full **CRUD** capabilities for products and categories.
- Secure role-based access control.
### User Features Include:
- Product filtering by price range.
- Adding items to cart for a smooth shopping experience.
---
## User Stories
- As an admin, I want to **view** all products and categories, so that I can monitor inventory and organization.
- As an admin, I want to **update** existing categories, so that I can keep the product structure accurate and organized.
- As an admin, I want to **update** product details, so that I can reflect changes or updates correctly.
- As an admin, I want to **create** new categories, so that I can group products under relevant categories.
- As an admin, I want to **create** new products, so that I can give users more options to choose from.
- As an admin, I want to **delete** categories that are no longer needed, so that I can keep the product organization clean and efficient.
- As an admin, I want to **delete** products that are no longer needed, so that I can keep the product organization clean and efficient.
- As a user, I want to **view** all available product categories, so that I can explore products under those categories.
- As a user, I want to **view** my shopping cart, so that I can see the items I plan to purchase.
- As a user, I want to **update** product quantities in my cart, so that I can adjust my order as needed.
- As a user, I want to **filter** products by price range, so that I can find items within my budget.
- As a user, I want to **remove** items from my cart, so that I can manage my shopping list effectively before checkout.

---
## Setup

- **IntelliJ IDEA:** Clone project, open in IntelliJ, configure JDK, and run EasyshopApplication.main().
- **MySQL:** Install MySQL, create 'EasyShop' database, configure connection in application.properties, and initialize with SQL scripts.
- **Postman:** Install Postman, import API collection, set environment variables, and test API endpoints.

---
## Prerequisites

- **IntelliJ IDEA**: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- **Java SDK:** Make sure Java SDK is installed and configured in IntelliJ.
- **MySQL Workbench**: Set up a MySQL database for the project.

---
## Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open **IntelliJ IDEA.**
2. Select **"Open"** and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the **main class** with the **public static void main(String[] args) method**. In this project, it's **EasyshopApplication** located in the **org.yearup package**.
5. Right-click on the **EasyshopApplication.java** file and select 'Run 'EasyshopApplication.main()'' to start the application. 

---
## Technologies Used

- **Java:** Amazon Corretto version 17.0.12.
- **Spring Boot:** For building the **RESTful API** and handling application configuration.
- **MySQL:** As the database for **data persistence**.
- **Maven:** For **project management** and dependency management.

---
## Demo
### Postman Run Result

![Postman Collections Passed.JPG](imgs%2FPostman%20Collections%20Passed.JPG)
### Website General Appearance

![Website.JPG](imgs%2FWebsite.JPG)

### Categorization Feature

![Categorize.JPG](imgs%2FCategorize.JPG)

### Price Range Filtering

![Filtering.JPG](imgs%2FFiltering.JPG)



---
## Future Work

Outline potential future enhancements or functionalities you might consider adding:

- Integration of a Recommendation Engine: This would allow the system to provide recommendations to logged-in users based on their behavior and purchase history, enhancing the shopping experience.
- Mobile App Development: Creating a dedicated mobile application for both iOS and Android to increase accessibility and user engagement.

---
## Resources

- **Tutorials and Documentation:**
    - [Java Programming Tutorial](https://www.w3schools.com/java)
    - [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)
    - [MySQL Documentation](https://dev.mysql.com/doc/)

- **Learning Platforms:**
    - [Year Up United](https://yearup.brightspace.com/d2l/home/8605)

- **Code Examples and References:**
    - [Java Code Library](https://www.baeldung.com/java-current-month-start-date#:~:text=Using%20the%20LocalDate%20Class,date%20with%20the%20day%20altered.)
    - [GeeksforGeeks Java](https://www.geeksforgeeks.org/java/)

- **Community Support:**
    - [Stack Overflow - Java](https://stackoverflow.com/questions/tagged/java)

---
## Team Members

- **Yigit Demirci** Project Developer

---
## Thanks

- Thank you to **Raymond** for continuous support and guidance. 

---