package com.example.kotlin_classes.abschluss_abgabe

/**
 * Represents the status of a book
 * Possible status:
 * * Available
 * * CheckedOut
 * * Reserved
 */
sealed class BookStatus {
    /**
     * The book is available
     */
    object Available : BookStatus()

    /**
     * The book is checked out until `dueDate`
     * @param dueDate The date when it has to be returned
     */
    data class CheckedOut(val dueDate: String) : BookStatus()

    /**
     * The book is reserved by `reservedBy`
     * @param reservedBy The person who has this book reserved
     */
    data class Reserved(val reservedBy: String) : BookStatus()

    /**
     * Returns the description of this `BookStatus`
     */
    fun getDescription(): String {
        return when (this) {
            Available -> ("Das Buch ist verfügbar.\n")
            is CheckedOut -> ("Das Buch ist bis voraussichtlich ${this.dueDate} ausgeliehen.\n")
            is Reserved -> ("Das Buch wurde bereits von ${this.reservedBy} reserviert.")
        }
    }
}