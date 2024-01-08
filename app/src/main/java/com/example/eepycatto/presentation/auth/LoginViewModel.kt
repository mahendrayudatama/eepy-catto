package com.example.eepycatto.presentation.auth

import androidx.lifecycle.ViewModel
import com.example.eepycatto.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository : UserRepository
) : ViewModel() {

}