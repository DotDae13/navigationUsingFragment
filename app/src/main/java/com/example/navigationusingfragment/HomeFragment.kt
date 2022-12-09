package com.example.navigationusingfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //cpp Button code to navigate to cpp fragment
        val cppButton = view.findViewById<Button>(R.id.homeToCppButton)
        cppButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_cppFragment)
        }

        //python Button code to navigate to python fragment
        val pythonButton = view.findViewById<Button>(R.id.homeToPythonButton)
        pythonButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_pythonFragment)
        }

        //kotlin Button code to navigate to kotlin fragment
        val kotlinButton = view.findViewById<Button>(R.id.homeToKotlinButton)
        kotlinButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_kotlinFragment)
        }

        //solidity Button code to navigate to solidity fragment
        val solidityButton = view.findViewById<Button>(R.id.homeToSolidityButton)
        solidityButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_solidityFragment)
        }

        //csharp Button code to navigate to csharp fragment
        val cSharpButton = view.findViewById<Button>(R.id.homeToCSharpButton)
        cSharpButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_CSharpFragment)
        }
        return view
    }
}
