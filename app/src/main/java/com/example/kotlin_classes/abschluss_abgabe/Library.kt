package com.example.kotlin_classes.abschluss_abgabe

import java.util.ArrayList

/**
 * Represents a library containing books and having an address.
 * @param books The list of books in this library
 * @param libraryAddress The address of this library
 */
class Library(
    val books: List<Book> = emptyList<Book>(),
    var libraryAddress: LibraryAddress? = null
) {

    /**
     * Represents the address of the library containing a street, city and zipcode
     * @param street The street of the library
     * @param city The city of the library
     * @param zipCode The zipcode of the library
     */
    class LibraryAddress(val street: String, val city: String, val zipCode: String) {
        fun printAddress() = "Street: $street, City: $city, Zipcode: $zipCode"
    }

    /**
     * Represents a library member with a name and an ID
     * @param name The name of the member
     * @param memberId The ID of the member
     */
    inner class LibraryMember(val name: String, val memberId: Int) {
        /**
         * Checkout a book setting its `status` to `BookStatus.CheckedOut`
         * @param book The book to be checked out
         * @param dueDate The date when the book has to be returned
         */
        fun checkoutBook(book: Book, dueDate: String) {
            book.status = BookStatus.CheckedOut(dueDate)
        }

        /**
         * Reserve a book setting its `status` to `BookStatus.Reserved`
         * @param book The book to be reserved
         */
        fun reserveBook(book: Book) {
            book.status = BookStatus.Reserved(name)
        }
    }

    /**
     * Add a book to the library
     * @param book The book to be added
     */
    fun addBook(book: Book) {
        books.plus(book)
    }

    /**
     * Search the library for a book matching the given title. Returns null if no book was found.
     * @param title The title of the book that is being searched
     * @return The found book or `null`
     */
    fun searchBookByTitle(title: String): Book? {
        for (book: Book in books) {
            if (book.title == title) {
                return book
            }
        }
        return null
    }

    /**
     * Returns a list of all books that have been written by a specific author. Returns an empty List if no book has been found.
     * @param author The author of the books that are being searched
     * @return A list containing all found books or an `emptyList()`
     */
    fun searchBooksByAuthor(author: String): List<Book> {
        val foundBooks: List<Book> = ArrayList()
        for (book: Book in books) {
            if (book.author == author) {
                foundBooks.plus(book)
            }
        }
        return foundBooks
    }

    /**
     * Prints out the status of all books in the library
     */
    fun printStatusForAllBooks() {
        for (book: Book in books) {
            println("\"${book.title}\" von ${book.author}: ${book.status.printBookStatus()}")
        }
    }
}