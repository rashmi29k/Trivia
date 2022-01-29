package com.example.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.trivia.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    private var _binding: FragmentGameWonBinding? = null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding= FragmentGameWonBinding.inflate(inflater,container, false)
        val args = GameWonFragmentArgs.fromBundle(requireArguments())
        binding?.nextMatchButton?.setOnClickListener {
            it.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameWonFragment(args.numQuestions, args.numCorrect))
        }


        Toast.makeText(context, "number: ${args.numCorrect}", Toast.LENGTH_LONG).show()
        return binding?.root
    }
}
