package com.example.kotlin_classes.abschluss_abgabe

/**
 * Contains all available genres
 */
enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Non fictional stories and novels"),
    SCIENCE("Science stuff"),
    HISTORY("Stuff about history"),
    CHILDREN("Books for children");

    /**
     * Returns the description of this Genre
     */
    fun printDescription(): String = description
}