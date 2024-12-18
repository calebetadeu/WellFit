package com.calebetadeu.wellfit.login.di

import com.calebetadeu.wellfit.login.presentation.LoginViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val loginModule = module {
    viewModelOf(::LoginViewModel)
}