package com.noxis.decomposeapp

import android.util.Log

class FakeAuthorizationRepository: AuthorizationRepository {
    override suspend fun signIn(login: String, password: String) {
        Log.d("FakeAuthorizationRepository", "signIn: $login, $password")
    }
}