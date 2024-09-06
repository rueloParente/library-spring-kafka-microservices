# library-microservice

## Description
The library microservice will be implemented using clean architecture. We will use DIP (Dependency Inversion Principle) to decouple the high-level policy from the low-level details. The high-level policy will be implemented in the use cases and the low-level details will be implemented in the entities and the data access objects. Particularly in the repository implementation.

## Diagrams
### Logical View of the Library Microservice
![Logical View](./docs/imgs/library-logical-view.svg)


### Process View happy path of adding a book to the library 
![Process View](./docs/imgs/process-view/library-add-book.svg)

### Process View happy path of updating a book in the library
![Process View](./docs/imgs/process-view/library-update-book.svg)

### Process View happy path of getting all books in the library
![Process View](./docs/imgs/process-view/library-get-books.svg)

### Process View happy path of deleting a book in the library
![Process View](./docs/imgs/process-view/library-delete-book.svg)