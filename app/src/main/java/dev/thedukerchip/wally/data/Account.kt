package dev.thedukerchip.wally.data

import java.util.UUID

data class Account(
    val id: String,
    val name: String,
    val initialBalance: Float,
) {
    companion object {
        fun create(
            id: String = UUID.randomUUID().toString(),
            name: String = "Personal",
            initialBalance: Float = 0.0f, // TODO Find a better way to handle the amount data type
        ) = Account(id, name, initialBalance)
    }
}