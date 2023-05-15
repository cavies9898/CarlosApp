package com.example.carlosapp.ui.login

data class LoginViewState(
    val isLoading: Boolean = false,
    val isValidEmail: Boolean = false,
    val isValidPassword: Boolean = false
)