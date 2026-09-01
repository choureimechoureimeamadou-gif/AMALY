package com.amali.chat.data.auth

class AuthManager {

    private var currentUserId: String? = null
    private var currentPhone: String? = null

    fun login(phone: String, userId: String) {
        currentPhone = phone
        currentUserId = userId
    }

    fun logout() {
        currentPhone = null
        currentUserId = null
    }

    fun isLoggedIn(): Boolean {
        return currentUserId != null
    }

    fun getUserId(): String? {
        return currentUserId
    }

    fun getPhone(): String? {
        return currentPhone
    }
}
