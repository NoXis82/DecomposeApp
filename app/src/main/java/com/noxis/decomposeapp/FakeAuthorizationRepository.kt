package com.noxis.decomposeapp

class FakeAuthorizationRepository: AuthorizationRepository {
    override suspend fun signIn(login: String, password: String) {
        //todo что делается
    }
}