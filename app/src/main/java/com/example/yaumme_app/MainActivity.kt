package com.example.yaumme_app

import Page.Navigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.rememberScrollState
import Object.*

//Global var


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Data()

            val scrollState = rememberScrollState()
            Navigation(scrollState = scrollState)
        }
    }
}



