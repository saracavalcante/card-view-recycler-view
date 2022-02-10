package br.com.saradev.besttrips.model

import br.com.saradev.besttrips.R

data class Trip(
    val tripImage: Int,
    val city: String,
    val country: String,
    val description: String,
    val id: Int? = listOf<Trip>().size,
) {

    companion object {

        fun populateTrips() = listOf<Trip>(
            Trip(
                R.drawable.image_1,
                "Abruzzo",
                "Italy",
                "Stretching from the heart of the Apennines to the Adriatic Sea on the peninsula's southeastern side, Abruzzo, Italy has long been one of the country's most overlooked destinations despite its unspoiled villages, picturesque Trabocchi Coast, and stunning natural escapes. Over the past few years, however, it has gone from a sleepy underdog to an ambitious harbinger of slow travel, sustainable gastronomy, and conscious hospitality."
            ),
            Trip(
                R.drawable.image_2,
                "Budapest",
                "Hungary",
                "Very few places in the world capture both old-world charm and elegant modernity like Hungary's capital city, and Budapest's latest 130-room luxury hotel, Matild Palace, is a shining example. The neo-baroque palace-turned-hotel, which opened last summer in the city's District V, is a UNESCO-protected site that once housed the city's royalty. The hotel is now home to Wolfgang Punk's famed restaurant, Spago, the first of its kind in central Europe."
            ),
            Trip(
                R.drawable.image_3,
                "Burgundy",
                "France",
                "The region of Burgundy is known for — you guessed it — its Burgundy wine, but French wine isn't the only reason Burgundy is a must-visit in 2022. In the spring, the region's capital city of Dijon will welcome the Cité Internationale de la Gastronomie et du Vin (International City of Gastronomy and Wine), an expansive complex with a cooking school, a new hotel, a handful of restaurants, and a wine cellar with over 250 by-the-glass offerings."
            ),
            Trip(
                R.drawable.image_4,
                "Crete",
                "Greece",
                "The Greek Islands have long been a perennial favorite vacation destination for discerning travelers, and Crete, the largest of the 227 islands in the archipelago, deserves a spot atop your must-see list. Yes, it's a place where you can find the white-washed buildings and blue roofs you've lusted after on Instagram for years, and a spot where you can dive into the cerulean blue waters of the Mediterranean at every turn."
            ),
            Trip(
                R.drawable.image_5,
                "Doha",
                "Qatar",
                "As we ask ourselves what cities of the future should look like, we naturally look around for examples. Places like Shanghai, Tokyo, and New York City seem to fit the description on paper, but I'd argue that no city better encapsulates that definition than Doha, the capital of Qatar."
            ),
            Trip(
                R.drawable.image_6,
                "Edinburgh",
                "Scotland",
                "The Auld Reekie is buzzing with new energy. The highly anticipated Hotel W, designed by Jestico and Whiles in conjunction with Allan Murray Architects, is opening next winter. And several other hotels have recently opened in and around the city — Marine North Berwick, the Market Street hotel, Rusacks St. Andrews, and ship-turned-luxury-hotel Fingal."
            ),
            Trip(
                R.drawable.image_7,
                "Franklin",
                "Tennessee",
                "Despite its count of more than 80,000 year-round residents, the very walkable Franklin firmly grasps onto its small-town charms, starting with a quintessentially quaint downtown chock-full of shops and restaurants finding shelter in brick storefronts lining the sidewalks. The uninitiated might know this place for its past — Civil War museums, battleground sites, and historic markers telling the stories of a slave market, race riots, and Black soldiers in the U.S."
            ),
            Trip(
                R.drawable.image_8,
                "Kaunas",
                "Lithuania",
                "Kaunas, Lithuania has a lofty New Year's resolution. After a century of wars, Soviet rule, and, since the 1990s, independence, this UNESCO Creative City of Design is ready to cultivate a new identity — and it's doing so as one of two European Capitals of Culture for 2022 (alongside Novi Sad, Serbia). The festivities commence in January, with thousands of concerts, festivals, exhibitions, and events throughout the year to celebrate Kaunas' history while cementing its path forward."
            )
        )
    }
}
