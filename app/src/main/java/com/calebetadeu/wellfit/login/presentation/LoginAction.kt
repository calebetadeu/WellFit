package com.calebetadeu.wellfit.login.presentation

sealed class LoginAction {
    object Login : LoginAction()
    object IsLoggedIn : LoginAction()
    object Logout : LoginAction()

}