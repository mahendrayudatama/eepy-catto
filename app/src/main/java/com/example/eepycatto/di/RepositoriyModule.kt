package com.example.eepycatto.di

import com.example.eepycatto.data.repository.UserRepositoryImplementation
import com.example.eepycatto.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriyModule {
    @Binds
    abstract fun provideUserRepository(impl: UserRepositoryImplementation): UserRepository
}