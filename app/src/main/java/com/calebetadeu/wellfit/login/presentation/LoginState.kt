package com.calebetadeu.wellfit.login.presentation

data class LoginState(
    val isLoggedIn: Boolean = false,
    val error: String? = null,
    val isLoading: Boolean = false,
    val username: String? = null,
    val password: String? = null
)