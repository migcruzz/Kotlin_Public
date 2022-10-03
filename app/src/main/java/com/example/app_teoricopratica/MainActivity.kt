package com.example.app_teoricopratica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

// Parte relacionada com ciclo de vida de uma APP em Kotlin
// Fez-se radução com recurso a strings.xml" usando o inglês como default e o portugês como predefinição
//

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,R.string.Welcome, Toast.LENGTH_SHORT).show()


    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop")
    }







}


