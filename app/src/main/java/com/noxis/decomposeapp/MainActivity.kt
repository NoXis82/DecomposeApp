package com.noxis.decomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

//            val rootComponent =
//                RealMainComponent(defaultComponentContext(), FakeAuthorizationRepository())
//            MainUi(mainComponent = rootComponent)
//            val rootComponent = RealNewEmployeesComponent(defaultComponentContext())
//            NewEmployeesUi(component = rootComponent)
        }
    }
}
