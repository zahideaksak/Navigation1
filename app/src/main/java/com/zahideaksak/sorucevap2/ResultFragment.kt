package com.zahideaksak.sorucevap2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zahideaksak.sorucevap2.databinding.FragmentResultBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class ResultFragment : Fragment(R.layout.fragment_result) {
    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args : ResultFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val answer = arguments?.getString("answer")
        binding.result.text = when {
            args.answer.equals("ankara", true) -> "Tebrikler bildiniz!"
            else -> "Üzgünüz bilemediniz!"
        }

        //bir geri fragmente gider
        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }
        //anasayfaya geri donmek icin, false diyoruz cunku anasayfa gitmesin istiyoruz. true deseydik anasayfayı da gecip ondan onceki sayfaya giderdi.
        binding.button.setOnClickListener {
            findNavController().popBackStack(R.id.homeFragment, false)
        }
    }
}