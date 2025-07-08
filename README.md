# Online-BookStore-for-Fawry-using-Java
# Quantum Book Store 📚

A simple, extensible object-oriented Java application that simulates an online bookstore with support for different book types and core functionalities like purchasing, removing outdated books, and managing inventory.

## 📦 Features

- Supports multiple types of books (all inherit from the abstract `Book` class):
  - **PaperBook** – has stock and can be physically shipped
  - **EBook** – has a file type and is delivered via email
  - **DemoBook** – not for sale, for showcase/demo only
- Add books to the store with full metadata (title, author, ISBN, etc.)
- Purchase books using ISBN and quantity
  - Automatically sends PaperBooks to a shipping service (simulated)
  - Automatically sends EBooks to a mail service (simulated)
- Removes outdated books based on their publication year
- Clean, testable console output
- Easily extensible: new book types can be added without modifying store logic

## 🏗️ Project Structure

```
📁 src/
├── Book.java             # Abstract base class for all books
├── PaperBook.java        # Physical book class
├── EBook.java            # Electronic book class
├── Demo.java             # Showcase/demo book class (not for sale)
├── QuantumBookStore.java # Manages the inventory and purchase logic
└── QuantumBookStoreTest.java # Main test class with various scenarios
```
## 📸  Screenshot from Running App

![Screenshot 2025-07-09 021759](https://github.com/user-attachments/assets/b26cb88e-7683-48f8-a88e-fa2107162ffd)


## 📐 UML Diagram

![HWH3MsKPXwyz1bdh](https://github.com/user-attachments/assets/81a318dd-e686-44b9-9893-3ce1239c0d2e)





## 📈 Future Improvements

- Save/load inventory from files (CSV/JSON)
- GUI or Web-based frontend
- Real email/shipping service integration
- Customer class & shopping cart system


