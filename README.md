# 📞 iFriend Contact Organizer

A command-line based Contact Management System developed using Java for managing personal and professional contacts efficiently.

## 📖 Project Overview

**iFriend Contact Organizer** is a Java CLI application designed to organize contact details digitally. The system allows users to add, update, search, delete, and list contacts with proper validations and sorting functionalities.

This project was developed using core Java concepts such as:

* Arrays
* Methods
* Loops
* Conditional Statements
* Flow Control
* Input Validation
* Command Line Interface (CLI)

---

## ✨ Features

### ➕ Add Contacts

* Auto-generate Contact IDs (`C0001`, `C0002`, ...)
* Store contact details:

  * Contact ID
  * Name
  * Phone Number
  * Company
  * Salary
  * Birthday
* Input validations:

  * Phone number validation
  * Salary validation
  * Birthday validation

### ✏️ Update Contacts

Search contacts using:

* Name
* Phone Number

Update:

* Name
* Phone Number
* Company
* Salary

---

### ❌ Delete Contacts

* Search contacts by name or phone number
* View contact details before deletion
* Confirmation before deleting

---

### 🔍 Search Contacts

* Search using name or phone number
* Display full contact details

---

### 📋 List Contacts

Sort and display contacts by:

1. Name
2. Salary
3. Birthday

---

## 🛠 Technologies Used

* Java
* Scanner Class
* Arrays
* Command Line Interface (CLI)

---

## 📂 Project Structure

```text
iFriend-Contact-Organizer/
│
├── ContactOrganizer.java
├── README.md
```

---

## 🚀 How to Run

### Compile the Program

```bash
javac ContactOrganizer.java
```

### Run the Program

```bash
java ContactOrganizer
```

---

## ✅ Validations Implemented

* Contact ID generation without duplicates
* Phone number must:

  * Start with `0`
  * Contain exactly 10 digits
* Salary must be positive
* Birthday:

  * Format: `YYYY-MM-DD`
  * Must be a valid date
  * Cannot be a future date

---

## 📸 System Functionalities

* Add Contact
* Update Contact
* Delete Contact
* Search Contact
* Sort & List Contacts
* Console Clear Function
* User Input Validation

---

## 🎯 Learning Outcomes

Through this project, the following concepts were practiced:

* Array manipulation
* Data validation
* Method decomposition
* CLI application design
* Sorting techniques
* Searching algorithms

---

## 👩‍💻 Author

**Chathurani Nimesha Thuduwage**
Computing and Information Systems Undergraduate

---

## 📜 License

This project is developed for educational purposes as coursework.
