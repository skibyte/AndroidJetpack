package com.interview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class UserRepository {
    private val persons = listOf(Person("Andres", 20), Person("Hector", 27), Person("Sara", 35))
    private val mutableLiveData  by lazy {
        val liveData = MutableLiveData<List<Person>>()
        GlobalScope.launch (Dispatchers.IO){
            delay(600)
            liveData.postValue(persons)
        }

        liveData
    }

    // personsLiveData declaration CAN'T be changed
    val personsLiveData : LiveData<List<Person>> = mutableLiveData
}