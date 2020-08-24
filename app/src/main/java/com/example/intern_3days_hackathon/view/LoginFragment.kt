package com.example.intern_3days_hackathon.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.intern_3days_hackathon.R
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_login, container, false)
        return showSearchActivity(v)
    }

    private fun showSearchActivity(v: View): View {
        val loginButton :Button = v.login_button
        loginButton.setOnClickListener { startActivity(SearchActivity.createIntent(view?.context)) }
        return v
    }
}
