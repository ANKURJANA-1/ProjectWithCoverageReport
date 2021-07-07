package com.repository

import android.content.Context
import javax.inject.Inject

class Repository @Inject constructor() : MainRepository {

    override fun getData(): String {
        return "hello world"
    }
}