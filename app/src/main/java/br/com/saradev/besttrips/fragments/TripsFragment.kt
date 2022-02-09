package br.com.saradev.besttrips.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.saradev.besttrips.R
import br.com.saradev.besttrips.databinding.ActivityMainBinding.inflate
import br.com.saradev.besttrips.databinding.FragmentTripsBinding

class TripsFragment : Fragment() {

    private var _binding: FragmentTripsBinding? = null
    private val binding: FragmentTripsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View = FragmentTripsBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root
}