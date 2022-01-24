package com.zahideaksak.sorucevap2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.zahideaksak.sorucevap2.databinding.FragmentQuestionBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class QuestionFragment : Fragment(R.layout.fragment_question) {
   private val binding by viewBinding(FragmentQuestionBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val answer = binding.editText.text.toString()
            /*
            findNavController().navigate(
                R.id.action_questionFragment_to_resultFragment,
                bundleOf("answer" to answer)
            )
            */
            findNavController().navigate(QuestionFragmentDirections.actionQuestionFragmentToResultFragment(answer))
        }
    }
}