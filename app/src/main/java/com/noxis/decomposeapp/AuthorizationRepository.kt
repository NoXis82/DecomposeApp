package com.noxis.decomposeapp

interface AuthorizationRepository {

    suspend fun signIn(login: String, password: String)
}