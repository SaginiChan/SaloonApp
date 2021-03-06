package com.example.myapplication.Auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)


        view.apply {
            signuptextView.setOnClickListener {
            val intent= Intent(activity,LoginFragment::class.java)
            activity?.startActivity(intent)
        }


        }

        return view
    }

}