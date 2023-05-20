package com.amicus.workdays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity: ComponentActivity() {
    
    override fun onCreate(
        savedInstanceState: Bundle?,
    ) {
        super.onCreate(savedInstanceState)
        val appStateModel = AppStateModel()
        setContent { appStateModel.AppContent() }
    }
}