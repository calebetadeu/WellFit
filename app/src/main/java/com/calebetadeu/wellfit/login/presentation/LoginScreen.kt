package com.calebetadeu.wellfit.login.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.calebetadeu.wellfit.ui.theme.WellFitTheme

@Composable
fun LoginRoot(
    modifier: Modifier = Modifier,
    state: LoginState,
    onAction: (LoginAction) -> Unit
){
  if(state.isLoading){
      Box(
          modifier = modifier
              .fillMaxSize(),
          contentAlignment = Alignment.Center
      ) {
          CircularProgressIndicator()
      }
  }else{
      LoginScreen(
          onLogin = {
              onAction(LoginAction.Login)
          }
      )
  }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier,onLogin: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login Screen")
        Spacer(Modifier.height(8.dp))
        Button(
            onClick =onLogin
        ) {
            Text("Login com Google")
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    WellFitTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            LoginScreen(
                onLogin = {}
            )
        }

    }
}