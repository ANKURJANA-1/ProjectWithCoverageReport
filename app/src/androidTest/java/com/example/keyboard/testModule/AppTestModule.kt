
package com.example.keyboard.testModule

import com.di.AppModule
import com.example.FakeRepository
import com.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [AppModule::class]
)
object AppTestModule {

    @Singleton
    @Provides
    fun getRepository(
    ): MainRepository {
        return FakeRepository()
    }

}