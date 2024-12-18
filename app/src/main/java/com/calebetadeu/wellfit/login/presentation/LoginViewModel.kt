package com.calebetadeu.wellfit.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val _state = MutableStateFlow(LoginState())
    val state = _state

    fun onAction(action: LoginAction) {
        when (action) {
            LoginAction.Login -> {
                loginWithGoogle()
            }

            else -> {}
        }
    }

    fun loginWithGoogle() {
        _state.value = _state.value.copy(
            isLoading = true
        )
        viewModelScope.launch {
            delay(2000L)
            _state.value = _state.value.copy(
                isLoading = false,
                isLoggedIn = true,
                username = "Calebe"
            )
        }

    }
}