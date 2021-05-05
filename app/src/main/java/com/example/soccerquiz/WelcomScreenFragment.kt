package com.example.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.FragmentWelcomScreenBinding


class WelcomScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding : FragmentWelcomScreenBinding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_welcom_screen, container, false
       )

        binding.letsPlayButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_welcomScreenFragment2_to_quizFragment)
        }

        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"
        return binding.root
    }
}
