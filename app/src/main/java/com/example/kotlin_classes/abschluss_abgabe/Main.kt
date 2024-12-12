package com.example.kotlin_classes.abschluss_abgabe

/**
 * Main class to test everything
 */
class Main {
    fun main() {
        val book1 = Book("1984", "George Orwell", Genre.FICTION)
        val book2 = Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE)
        val book3 = Book("The Diary of a Young Girl", "Anne Frank", Genre.HISTORY)
        val book4 = Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", Genre.FICTION)
        val book5 = Book("Green Eggs and Ham", "Stephen Hawking", Genre.CHILDREN)

        val libraryAddress = Library.LibraryAddress("123 Library Lane", "Booktown", "12345")
        val library = Library(
            books = listOf(book1, book2, book3, book4), libraryAddress = libraryAddress
        )
        library.addBook(book5)


        val member1 = library.LibraryMember("Alice", 1)

        println(library.libraryAddress?.printAddress())

        member1.checkoutBook(book1, "13.01.2025")
        member1.reserveBook(book2)
        library.printStatusForAllBooks()

        for (book in library.searchBooksByAuthor("Stephen Hawking")) {
            println(book)
        }
        println(library.searchBookByTitle("1984"))
    }
}