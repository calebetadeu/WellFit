package com.calebetadeu.wellfit.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.calebetadeu.wellfit.login.presentation.LoginRoot
import com.calebetadeu.wellfit.login.presentation.LoginViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun App(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            val viewModel = koinViewModel<LoginViewModel>()
            val state = viewModel.state.collectAsState()
            LaunchedEffect(key1 = state.value) {
                if (state.value.isLoggedIn) {
                    navController.navigate(Home)
                }
            }

            LoginRoot(
                state = state.value,
                onAction = { action ->
                    viewModel.onAction(action)
                }
            )
        }
        composable<Home> {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Home")
            }
            // HomeRoot()
        }
    }

}