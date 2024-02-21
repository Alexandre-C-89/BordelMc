package com.example.justnote.di

import com.example.bordelmc.data.repository.auth.RemoteDataRepository
import com.example.justnote.data.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(): AuthRepository {
        return AuthRepository()
    }

    @Provides
    @Singleton
    fun provideRemoteDataRepository():
            RemoteDataRepository = RemoteDataRepository()
}