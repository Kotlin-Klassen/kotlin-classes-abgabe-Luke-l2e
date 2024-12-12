package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents a book with a title, author genre and status
 * @param title The title of the book
 * @param author The author of the book
 * @param genre The genre of the book
 * @param status The status of the book
 */
data class Book(
    var title: String,
    var author: String,
    var genre: Genre,
    var status: BookStatus = BookStatus.Available
)
