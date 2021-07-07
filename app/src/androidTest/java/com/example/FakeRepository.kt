package com.example

import com.repository.MainRepository

class FakeRepository: MainRepository {
    override fun getData(): String {
        return "test"
    }
}