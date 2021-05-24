package com.example.myapplication.Auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.myapplication.Pages.Home
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.tohomepagebutton.setOnClickListener {

            /*
            since you are using nav graph instead of using intents to switch between activities,
            you can invoke the actions on the navgraph to navigate to the preferred destination
             to understand better check https://medium.com/swlh/android-navigation-component-part-1-6191323eaf39
             https://developer.android.com/guide/navigation/navigation-getting-started*/

            NavHostFragment.findNavController(this).navigate(R.id.action_loginFragment_to_home2)

        }

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}