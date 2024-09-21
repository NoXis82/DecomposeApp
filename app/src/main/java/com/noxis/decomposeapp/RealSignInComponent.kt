package com.noxis.decomposeapp

import android.util.Log
import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class RealSignInComponent(
    componentContext: ComponentContext,
    private val authorizationRepository: AuthorizationRepository,

    ) : ComponentContext by componentContext, SignInComponent {

    override val login = MutableStateFlow("")

    override val password = MutableStateFlow("")

    override val inProgress = MutableStateFlow(false)

    private val coroutineScope =
        componentCoroutineScope()//CoroutineScope(SupervisorJob() + Dispatchers.Main)

    override fun onLoginChanged(login: String) {
        this.login.value = login
    }

    override fun onPasswordChanged(password: String) {
        this.password.value = password
    }

    override fun onSignInClick() {
        coroutineScope.launch {
            inProgress.value = true
            delay(3000)
            authorizationRepository.signIn(login.value, password.value)
            inProgress.value = false

            // TODO: navigate to the next screen
        }
    }

    override fun unlockBonusTheoryMaterial() {
        Log.d("RealSignInComponent", ">>> unlockBonusTheoryMaterial invoke")
        coroutineScope.launch {
            inProgress.value = true
            delay(3000)
            inProgress.value = false
        }
    }


}