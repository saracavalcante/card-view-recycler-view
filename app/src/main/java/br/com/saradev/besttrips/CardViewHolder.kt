package br.com.saradev.besttrips

import androidx.recyclerview.widget.RecyclerView
import br.com.saradev.besttrips.databinding.CardCellBinding
import br.com.saradev.besttrips.model.Trip

class CardViewHolder(
    private val cardCellBinding: CardCellBinding
) : RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindTrip(trip: Trip) {
        cardCellBinding.ivCountry.setImageResource(trip.tripImage)
        cardCellBinding.tvCountry.text = trip.country
        cardCellBinding.tvCity.text = trip.city
    }
}