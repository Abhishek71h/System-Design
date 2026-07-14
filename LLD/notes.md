# Software Design Principles

By following software design principles, we can make our code:

- **Readable**
- **Structured**
- **Maintainable**
- **Extensible**
- **High Quality**

> **Note:** In software design, we focus on improving **code quality**, not on optimizing algorithms.

---

# SOLID Principles

- **SRP** – Single Responsibility Principle
- **OCP** – Open/Closed Principle
- **LSP** – Liskov Substitution Principle
- **ISP** – Interface Segregation Principle
- **DIP** – Dependency Inversion Principle

---

## 1. Single Responsibility Principle (SRP)

### Definition
A class should have only **one reason to change**, meaning it should have a **single responsibility**.

### Problem
A class handles multiple responsibilities (e.g., business logic and persistence).

### Solution
Split the responsibilities into separate classes, each focusing on a single task.

### Example

- `Employee` → Handles salary calculation.
- `EmployeeRepository` → Handles database operations.

---

## 2. Open/Closed Principle (OCP)

### Definition
Classes should be **open for extension** but **closed for modification**.

### Problem
Adding new features requires modifying existing code (e.g., adding a new format for invoice printing).

### Solution
Use abstractions (such as interfaces) so new functionality can be added without modifying existing code.

### Example

```text
InvoicePrinter
 ├── PDFInvoicePrinter
 └── ExcelInvoicePrinter
```

---

## 3. Liskov Substitution Principle (LSP)

### Definition
Subtypes must be substitutable for their base types without altering program behavior.

### Problem
A subclass changes the expected behavior of its parent class (e.g., an `Ostrich` overriding `fly()`).

### Solution
Redesign the hierarchy or use composition to ensure appropriate behavior.

### Example

Split the hierarchy into:

- `Bird`
- `FlyingBird`

---

## 4. Interface Segregation Principle (ISP)

### Definition
A class should not be forced to implement methods it doesn't use.

### Problem
Fat interfaces force classes to implement irrelevant methods.

### Solution
Split large interfaces into smaller, more specific interfaces.

### Example

Separate vehicle capabilities into:

- `Drivable`
- `Flyable`

---

## 5. Dependency Inversion Principle (DIP)

### Definition
High-level modules should not depend on low-level modules. Both should depend on abstractions.

### Problem
Tight coupling between high-level and low-level modules.

### Solution
Use dependency injection and abstractions to decouple modules.

### Example

A `Computer` depends on:

- `InputDevice`
- `OutputDevice`

instead of directly depending on concrete implementations like `Keyboard`, `Mouse`, or `Monitor`.

---

# Quick Revision Table

| Principle | Definition | Main Goal |
|-----------|------------|-----------|
| **SRP** | One class should have one responsibility. | Better maintainability |
| **OCP** | Open for extension, closed for modification. | Easy feature addition |
| **LSP** | Child classes should replace parent classes without breaking behavior. | Proper inheritance |
| **ISP** | Don't force classes to implement unused methods. | Small, focused interfaces |
| **DIP** | Depend on abstractions, not concrete implementations. | Loose coupling |
