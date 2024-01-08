package com.example.eepycatto

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


// class for setting up dependency
@HiltAndroidApp //this annotation needed for hilt code gen if u want to know read @https://developer.android.com/training/dependency-injection/hilt-android
class RootClass : Application(){

}