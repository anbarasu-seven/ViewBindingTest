package com.example.viewbindingtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.firstName?.text = "Anbarasu"
        binding?.lastName?.text = "Chinnaperumal"
        binding?.addressLine1?.text = "Address line 1"
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}