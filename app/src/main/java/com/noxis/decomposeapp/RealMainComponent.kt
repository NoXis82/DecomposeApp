package com.noxis.decomposeapp

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.childContext

class RealMainComponent(
    componentContext: ComponentContext,
    authorizationRepository: AuthorizationRepository
) : ComponentContext by componentContext, MainComponent {

    override val toolbarComponent: ToolbarComponent = RealToolbarComponent(
        childContext("toolbar"),
        onPositiveFeedbackGiven = {
            signInComponent.unlockBonusTheoryMaterial()
        }
    )

    override val signInComponent: SignInComponent = RealSignInComponent(
        childContext("signIn"),
        authorizationRepository
    )
}