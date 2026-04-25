🎂 Birthday Reminder Application
> *Never miss a birthday again.*
A secure, full-stack web application built with Spring Boot, Spring Data JPA, and MySQL that enables users to register, authenticate, and manage personal birthday records through a clean, scalable MVC-architected system.
<br>
![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.0-brightgreen?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

---
📌 Table of Contents
🌟 Overview
✨ Features
🛠️ Tech Stack
🗂️ Project Structure
⚙️ Getting Started
🖼️ Screenshots
🔮 Future Enhancements
👩‍💻 Author
---
🌟 Overview
The Birthday Reminder Application solves the everyday problem of forgetting important birthdays by providing a centralized, secure platform to log and track them.
Users can sign up, log in, and manage a personal list of birthday entries — all persisted in a relational MySQL database. The application is built following the MVC (Model-View-Controller) architecture pattern, ensuring clean separation of concerns, scalability, and maintainability. Dynamic pages are rendered server-side using Thymeleaf templates, delivering a smooth and responsive user experience without the need for a separate frontend framework.
---
✨ Features
🔐 Secure User Registration and Login with session-based authentication
📝 Full CRUD operations — Add, View, Edit, and Delete birthday entries
📋 Structured Birthday List View displaying all saved records in a clean tabular format
💾 MySQL database integration via Spring Data JPA for reliable, ORM-based data persistence
🌐 Dynamic page rendering using Thymeleaf server-side templates
📱 Responsive UI built with HTML and CSS for cross-device compatibility
🏗️ Follows MVC Architecture for modularity and maintainability
⚡ Built on Spring Boot 3.5.0 (Java 17) with Maven build management
---
🛠️ Tech Stack
🔩 Layer	💻 Technology
🎨 Frontend	HTML, CSS, Thymeleaf
⚙️ Backend	Java 17, Spring Boot 3.5.0 (Web, Data JPA, DevTools)
🗄️ Database	MySQL 8.0
🔗 ORM	Spring Data JPA (Hibernate)
📦 Build Tool	Maven
🌿 Version Control	Git & GitHub
🖥️ IDE	IntelliJ IDEA / Eclipse
---
🗂️ Project Structure
```
🎂 birthday-reminder/
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/com/example/birthdayreminder/
│   │   │   ├── 📂 controller/        # MVC Controllers
│   │   │   ├── 📂 model/             # Entity classes (User, Birthday)
│   │   │   ├── 📂 repository/        # Spring Data JPA Repositories
│   │   │   ├── 📂 service/           # Business Logic Layer
│   │   │   └── 📄 BirthdayReminderApplication.java
│   │   └── 📁 resources/
│   │       ├── 📂 templates/         # Thymeleaf HTML templates
│   │       ├── 📂 static/            # CSS, JS, Images
│   │       └── 📄 application.properties
├── 📄 pom.xml
└── 📄 README.md
```
---
⚙️ Getting Started
🔧 Prerequisites
☕ Java 17 or higher
📦 Maven 3.8+
🗄️ MySQL 8.0+
🖥️ IntelliJ IDEA or Eclipse (recommended)
🚀 Installation
① Clone the repository
```bash
git clone https://github.com/your-username/birthday-reminder.git
cd birthday-reminder
```
② Configure the database
Create a MySQL database:
```sql
CREATE DATABASE birthday_db;
```
Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/birthday_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
③ Build and run the application
```bash
mvn clean install
mvn spring-boot:run
```
④ Access the application
Open your browser and navigate to:
```
http://localhost:8080
```
---
🖼️ Screenshots
🏠 Home Page
![Home Page](https://github.com/user-attachments/assets/1c126ba6-76c4-4e7a-9d0b-37c91c0fac76)
---
🔑 Login / Signup Page
![Login Signup](https://github.com/user-attachments/assets/4f39b486-dc59-496a-8e60-57e53df5dab4)
---
📝 Signup Page
![Signup](https://github.com/user-attachments/assets/8aa21a94-9d8a-45dd-94e7-283bd5debb67)
---
🔓 Login Page
![Login](https://github.com/user-attachments/assets/1e4a8520-9454-4476-8fe3-89a122e869e3)
---
🎂 Birthday List
![Birthday List](https://github.com/user-attachments/assets/25f454d3-e04c-48d1-9676-5c147fc6145c)
---
➕ Add New Entry
![Add New](https://github.com/user-attachments/assets/bd9abbe8-824b-4596-ad21-7cd7f480fc6b)
---
🔮 Future Enhancements
📧 Email notification system to send automated birthday reminders
📊 Dashboard with upcoming birthdays highlighted by date proximity
🔌 REST API layer for mobile app integration
🔑 OAuth2-based social login (Google / GitHub)
👥 Role-based access control (Admin / User)
🌙 Dark mode UI support
---
👩‍💻 Author
Shanupriya T
🎓 B.E. Computer Science — Karpagam College of Engineering, Anna University
![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Follow-181717?style=for-the-badge&logo=github&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-400+_Problems-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)
---
<div align="center">
⭐ If you found this project helpful, consider giving it a star! ⭐
Made with ❤️ by Shanupriya T
</div>
