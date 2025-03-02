package com.noxis.decomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.arkivanov.decompose.defaultComponentContext
import com.noxis.decomposeapp.ui.theme.DecomposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val rootComponent =
                RealMainComponent(defaultComponentContext(), FakeAuthorizationRepository())
            MainUi(mainComponent = rootComponent)
        }
    }
}
