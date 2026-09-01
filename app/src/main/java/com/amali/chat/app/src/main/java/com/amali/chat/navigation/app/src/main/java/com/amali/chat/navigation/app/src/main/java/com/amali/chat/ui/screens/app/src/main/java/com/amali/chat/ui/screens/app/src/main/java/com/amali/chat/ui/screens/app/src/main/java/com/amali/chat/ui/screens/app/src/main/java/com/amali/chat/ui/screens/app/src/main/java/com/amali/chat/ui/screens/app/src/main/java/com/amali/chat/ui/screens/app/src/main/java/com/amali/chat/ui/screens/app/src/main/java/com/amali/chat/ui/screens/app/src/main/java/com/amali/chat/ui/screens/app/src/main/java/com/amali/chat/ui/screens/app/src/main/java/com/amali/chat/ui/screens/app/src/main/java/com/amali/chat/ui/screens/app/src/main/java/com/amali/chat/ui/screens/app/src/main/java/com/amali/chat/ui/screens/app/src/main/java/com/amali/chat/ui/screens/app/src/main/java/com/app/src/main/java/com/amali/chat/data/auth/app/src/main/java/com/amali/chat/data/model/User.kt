package com.amali.chat.data.model

data class User(
    val id: String,
    val phone: String,
    val name: String,
    val photoUrl: String? = null,
    val online: Boolean = false
)
