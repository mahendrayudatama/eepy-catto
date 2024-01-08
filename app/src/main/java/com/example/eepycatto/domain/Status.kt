package com.example.eepycatto.domain

//use to handle state of data so we can change loading,succees, or error
sealed class Status<out R> private constructor() {
    data class Success<out T>(val data: T) : Status<T>()
    data class Error(val msg: String) : Status<Nothing>()
    object Loading : Status<Nothing>()
}