package br.com.saradev.besttrips.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import br.com.saradev.besttrips.adapter.CardAdapter
import br.com.saradev.besttrips.databinding.FragmentTripsBinding
import br.com.saradev.besttrips.model.Trip.Companion.populateTrips

class TripsFragment : Fragment() {

    private var _binding: FragmentTripsBinding? = null
    private val binding: FragmentTripsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View = FragmentTripsBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        val tripList = populateTrips()

        binding.rvTrips.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = CardAdapter(tripList)
        }
    }
}