package com.example.hiltdependencyinjection

import android.content.Context
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HiltRepository @Inject constructor (context: Context): ViewModel() {
}