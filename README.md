# Book Store Management System

A simple Java OOP project that simulates a basic bookstore management system.

This project demonstrates:
- Object-Oriented Programming (OOP)
- Order processing
- Inventory management
- Validation
- Singleton and Observer design patterns

---

## Features

- Add books to catalogue
- Create customers
- Create sales orders
- Add order items
- Calculate total order price
- Validate orders
- Monitor inventory stock
- Display low stock alerts

---

## Technologies Used

- Java
- Maven
- VS Code

---

## Project Structure

```text
src/main/java/com/mycompany/software_project/
```

### Main Classes

- `Book`
- `Catalogue`
- `Customer`
- `SalesOrder`
- `SalesOrderItem`
- `OrderValidation`
- `InventoryManager`
- `PurchaseSystem`

### Test Classes

- `BookTest`
- `CustomerTest`
- `CatalogueTest`
- `SalesOrderTest`
- `ValidationTest`
- `InventoryTest`

---

## Design Patterns Used

### Singleton Pattern
Used in:
- `Catalogue`

---

### Observer Pattern
Used in:
- `InventoryManager`
- `PurchaseSystem`

---

## Sample Input

```text
B101
Java Programming
250
10
5
OReilly

B102
Data Structures
300
3
5
Pearson

C001
Mark

O1001

2
1
```

---

## Expected Output

```text
===== ORDER DETAILS =====
Order Validated Successfully
Order ID: O1001
Customer Name: Mark
Total Price: 800.0
```

---
