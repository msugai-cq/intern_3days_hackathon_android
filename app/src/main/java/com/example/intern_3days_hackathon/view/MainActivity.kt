package com.example.intern_3days_hackathon.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intern_3days_hackathon.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showLoginFragment()
        val actionBar = supportActionBar
        actionBar?.setTitle(R.string.login_view)
    }

    private fun showLoginFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_layout_frame, LoginFragment())
                .addToBackStack(null)
                .commit()
    }
}
