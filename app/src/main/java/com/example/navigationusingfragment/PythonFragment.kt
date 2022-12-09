package com.example.navigationusingfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class PythonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_python, container, false)
        val button = view.findViewById<Button>(R.id.pythonToHomeButton)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_pythonFragment_to_homeFragment)
        }
        return view
    }
}