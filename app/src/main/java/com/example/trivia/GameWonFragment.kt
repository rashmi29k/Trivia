package com.example.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.trivia.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    private var _binding: FragmentGameWonBinding? = null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding= FragmentGameWonBinding.inflate(inflater,container, false)

        binding?.nextMatchButton?.setOnClickListener {
            it.findNavController().navigate(R.id.titleFragment)
        }
        return binding?.root
    }
}
