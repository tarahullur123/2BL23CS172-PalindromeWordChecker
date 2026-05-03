# 2BL23CS172-PalindromeWordChecker
A Java Servlet-based web application that checks whether a given word is a palindrome or not.

# Palindrome Word Checker Web Application

## 📌 Description
This project is a Java-based web application developed using Servlets and Apache Tomcat. It checks whether a given word is a palindrome or not.

A palindrome is a word that reads the same forward and backward (e.g., madam, level).

---

## 🎯 Objective
- To understand Servlet concepts (doGet/doPost)
- To handle user input using HTML forms
- To perform string manipulation in Java

---

## 🛠️ Technologies Used
- Java (Servlet API - Jakarta)
- HTML
- Apache Tomcat v10.1
- Eclipse IDE

---

## 📁 Project Structure

PalindromeWordChecker/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── tara/
│       │           └── PalindromeServlet.java
│       │
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           │
│           ├── index.html
│
├── screenshots/
│   ├── screenshot1.png
│   ├── screenshot2.png
│
├── README.md


---

## ⚙️ Working

1. User enters a word in the input field
2. Form sends request to servlet (`/check`)
3. Servlet receives input
4. Reverses the word
5. Compares original and reversed word
6. Displays result

---

## 💻 Core Logic

```java
String word = request.getParameter("word");
String reverse = new StringBuilder(word).reverse().toString();

if(word.equalsIgnoreCase(reverse)) {
    // Palindrome
} else {
    // Not Palindrome
}

▶️ How to Run
Import project into Eclipse
Configure Apache Tomcat Server
Right-click project → Run As → Run on Server
Open browser:

http://localhost:8081/PalindromeWordChecker/index.html

📋 Requirements
Java JDK (17 or above recommended)
Eclipse IDE (Enterprise Edition)
Apache Tomcat v10.1
Web Browser (Chrome/Edge)

📸 Output
Input: madam → Output: Palindrome
Input: hello → Output: Not a Palindrome

📊 Features
Simple user interface
Case-insensitive checking
Fast processing using Servlet
Dynamic result display

📚 Conclusion

This project demonstrates how to build a basic Java web application using Servlets. It helps in understanding form handling, request-response cycle, and string manipulation.
