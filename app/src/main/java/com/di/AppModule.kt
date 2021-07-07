package com.di

import com.repository.MainRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import android.content.Context
import com.repository.Repository
import dagger.Provides
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRepository(
    ):MainRepository{
        return Repository()
    }
}