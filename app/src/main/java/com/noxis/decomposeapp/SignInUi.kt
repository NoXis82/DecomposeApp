package com.noxis.decomposeapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.noxis.decomposeapp.ui.theme.DecomposeAppTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun SignInUi(component: SignInComponent) {
    val login by component.login.collectAsState(Dispatchers.Main.immediate)
    val password by component.password.collectAsState(Dispatchers.Main.immediate)
    val inProgress by component.inProgress.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        TextField(
            value = login,
            onValueChange = component::onLoginChanged
        )
        Spacer(modifier = Modifier.size(16.dp))
        TextField(
            value = password,
            onValueChange = component::onPasswordChanged,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.size(16.dp))
        if (inProgress) {
            CircularProgressIndicator()
        } else {
            Button(onClick = component::onSignInClick) {
                Text(text = "Click")
            }
        }
    }

}


class FakeSignInComponent : SignInComponent {

    override val login = MutableStateFlow("login")
    override val password = MutableStateFlow("password")
    override val inProgress = MutableStateFlow(false)

    override fun onLoginChanged(login: String) = Unit
    override fun onPasswordChanged(password: String) = Unit
    override fun onSignInClick() = Unit
    override fun unlockBonusTheoryMaterial() = Unit
}

@Preview(showSystemUi = true)
@Composable
internal fun SignInUiPreview() {
    DecomposeAppTheme {
        SignInUi(FakeSignInComponent())
    }
}