# Book Store Application

This Java 21 app consists of a class representing book objects and a main class that stores these books and sorts them based on different criteria.

## How It Works?

### Book Class
The `Book` class represents the properties of a book (ID, book name, author name, page number, publish date). This class implements the `Comparable` interface to provide alphabetical sorting based on book names.

### Main Class
The `Main` class contains the entry point of the application. This class creates two different instances of `TreeSet` and populates them based on different sorting criteria.

- The first `TreeSet` (`set`) is sorted alphabetically based on book names.
- The second `TreeSet` (`set2`) is sorted based on the number of pages.

Both `TreeSet`s store the books and then print them to the console.

## How to Use?

1. Open this project in your Java development environment.
2. Run the `main` method in the `Main` class.
3. Observe the books printed with different sorting orders.
