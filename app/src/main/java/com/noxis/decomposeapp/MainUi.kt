package com.noxis.decomposeapp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.noxis.decomposeapp.ui.theme.DecomposeAppTheme

@Composable
fun MainUi(mainComponent: MainComponent) {
    DecomposeAppTheme {
        Scaffold(
            bottomBar = {
                ToolbarUi(mainComponent.toolbarComponent)
            }
        ) { _ ->
            SignInUi(component = mainComponent.signInComponent)
        }

    }
}