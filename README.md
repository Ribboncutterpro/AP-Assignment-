-  Simple User ID Generator (Java)

This is a basic Java program that generates a **unique user ID** using a person's name, email, and the current timestamp.

---

- Features

- Takes user **name** and **email** as input
- Removes whitespace and converts to lowercase
- Generates a short user ID using:
  - First 3 characters of the name
  - First 3 characters of the email
  - Current timestamp in milliseconds
- Prints the generated ID

---

-  How to Run

1. Make sure you have **Java installed**
2. Compile the file:

```bash
javac hello.java
java hello 

Example - 
Enter your name:
Kavya Raj

Enter your email:
kavya@example.com

Generated User ID: kavkav_1712223344556
