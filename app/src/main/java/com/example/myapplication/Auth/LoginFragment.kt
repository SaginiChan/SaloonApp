package com.example.myapplication.Auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.Pages.Home
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? =null
    private val  binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentLoginBinding.inflate(inflater, container, false)

        binding.tohomepagebutton.setOnClickListener {
            val intent =Intent (activity, Home::class.java)
            activity?.startActivity(intent)

        }

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding =null
    }

}