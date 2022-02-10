package br.com.saradev.besttrips.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import br.com.saradev.besttrips.CardViewHolder
import br.com.saradev.besttrips.databinding.CardCellBinding
import br.com.saradev.besttrips.model.Trip

class CardAdapter(

    private val trips: List<Trip>

) : ListAdapter<Trip, CardViewHolder>(DIFF_UTIL) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindTrip(trips[position])
    }

    override fun getItemCount(): Int = trips.size

    private companion object {
        private val DIFF_UTIL = object: DiffUtil.ItemCallback<Trip>() {

            override fun areItemsTheSame(oldItem: Trip, newItem: Trip): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Trip, newItem: Trip): Boolean {
                return oldItem == newItem
            }

        }
    }
}