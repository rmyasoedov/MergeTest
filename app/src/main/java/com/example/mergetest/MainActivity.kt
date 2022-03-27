package com.example.mergetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.mergetest.frame1.Frame1Fragment
import com.example.mergetest.frame2.Frame2Fragment

class MainActivity : AppCompatActivity() {

    lateinit var ft: FragmentTransaction

    lateinit var buttonFrame1: Button
    lateinit var buttonFrame2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFrame1 = findViewById(R.id.buttonFrame1)
        buttonFrame2 = findViewById(R.id.buttonFrame2)

        buttonFrame1.setOnClickListener {
            changeFragment(Frame1Fragment())
        }

        buttonFrame2.setOnClickListener {
            changeFragment(Frame2Fragment())
        }
    }

    //Запустить фрагмент
    fun changeFragment(fr: Fragment){
        ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.content, fr,"frag")
        ft.commit()
    }
}