package com.rujirakongsomran.kt_screenshotdetection

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.rujirakongsomran.kt_screenshotdetection.databinding.ActivityMainBinding

class MainActivity : ScreenshotDetectionActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onScreenCaptured(path: String) {
        Snackbar.make(binding.root, path, Snackbar.LENGTH_SHORT).show()
    }
}