package com.example.navigationusingfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class cppFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,

        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_cpp, container, false)
        val button = view.findViewById<Button>(R.id.cppToHomeButton)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_cppFragment_to_homeFragment)
        }
        return view
    }
}