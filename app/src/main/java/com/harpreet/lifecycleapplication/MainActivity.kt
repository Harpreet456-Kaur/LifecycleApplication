package com.harpreet.lifecycleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        System.out.println("|in on create")
        Toast.makeText(this,"This is OnCreate",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"This is ONStart",Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"This is OnResume",Toast.LENGTH_LONG).show()
        System.out.println("OnResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"This is OnPause",Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"This is OnRestart",Toast.LENGTH_LONG)
            .show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"This is OnStop",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"This is OnDestroy",Toast.LENGTH_LONG).show()
    }
}