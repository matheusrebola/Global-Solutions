package com.example.gs1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gs1.R.id.fragmentContainer
import com.example.gs1.fragments.FragmentDrone
import com.example.gs1.fragments.FragmentImages
import com.example.gs1.fragments.FragmentPlantas
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowFragmentDrone: Button = findViewById(R.id.buttonShowFragmentDrone)
        buttonShowFragmentDrone.setOnClickListener {
            val fragmentDrone = FragmentDrone()
            supportFragmentManager.beginTransaction()
                .replace(fragmentContainer, fragmentDrone)
                .addToBackStack(null)
                .commit()
        }

        val buttonShowFragmentImages: Button = findViewById(R.id.buttonShowFragmentImages)
        buttonShowFragmentImages.setOnClickListener {
            val fragmentImage = FragmentImages()
            supportFragmentManager.beginTransaction()
                .replace(fragmentContainer, fragmentImage)
                .addToBackStack(null)
                .commit()
        }

        val buttonShowFragmentPlantas: Button = findViewById(R.id.buttonShowFragmentPlantas)
        buttonShowFragmentPlantas.setOnClickListener {
            val fragmentPlantas = FragmentPlantas()
            supportFragmentManager.beginTransaction()
                .replace(fragmentContainer, fragmentPlantas)
                .addToBackStack(null)
                .commit()
        }
    }
}
