package com.example.odev3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev3.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.button3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_detayFragment)
        }
        tasarim.button4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_detayFragment)
        }
        tasarim.button5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_detayFragment)
        }
        tasarim.button6.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_detayFragment)
        }
        return tasarim.root
    }
}