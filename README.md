# Online-BookStore-for-Fawry-using-Java
# Quantum Book Store 📚

A simple, extensible object-oriented Java application that simulates an online bookstore with support for different book types and core functionalities like purchasing, removing outdated books, and managing inventory.

## 📦 Features

- Add different types of books to the inventory:
  - **PaperBook** – has stock and can be shipped
  - **EBook** – has file type and can be delivered via email
  - **DemoBook** – not for sale
- Purchase books by ISBN and quantity
- Automatically sends books through shipping or email (simulated with print)
- Remove outdated books based on their publish year
- Fully extensible: new book types can be added without changing the store logic
- Console-friendly test output with clean formatting

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



## 📐 UML Diagram

[UML.pdf](https://github.com/user-attachments/files/21129196/UML.pdf)




## 📈 Future Improvements

- Save/load inventory from files (CSV/JSON)
- GUI or Web-based frontend
- Real email/shipping service integration
- Customer class & shopping cart system


