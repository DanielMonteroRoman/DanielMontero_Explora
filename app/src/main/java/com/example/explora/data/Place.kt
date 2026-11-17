package com.example.explora.data

import androidx.annotation.DrawableRes
import com.example.explora.R

data class  Place(
    val name: String,
    val city: String,
    @DrawableRes val image: Int,
    val isVisited: Boolean = false,
    val points: Float =0.0f

)

val PlacesExample = listOf(
    Place("Lonja de la seda", city="Valencia", R.drawable.lonja),
    Place("Castillo de Sagunto", city="Sagunto", R.drawable.castillo),
    Place("Faro de Cullera", city="Cullera", R.drawable.faro),
    Place("Puente de las flores", city="Valencia", R.drawable.flores),

)

val ConcertPlacesExemple = listOf(
    Place(
        name = "Sala Repvblicca",
        city = "Mislata",
        image = R.drawable.republica,
        isVisited = true,
        points = 4.6f
    ),
    Place(
        name = "Sala Moon",
        city = "València",
        image = R.drawable.moon,
        isVisited = false,
        points = 4.4f
    ),
    Place(
        name = "16 Toneladas",
        city = "València",
        image = R.drawable._16_toneladas, // En Android los recursos no pueden empezar por número
        isVisited = true,
        points = 4.8f
    ),
    Place(
        name = "Loco Club",
        city = "València",
        image = R.drawable.castillo,
        isVisited = true,
        points = 4.7f
    ),
    Place(
        name = "Sala Jerusalem",
        city = "València",
        image = R.drawable.jerusalem,
        isVisited = false,
        points = 4.3f
    ),
    Place(
        name = "Marina Beach Club",
        city = "València",
        image = R.drawable.marina_beach,
        isVisited = false,
        points = 4.2f
    ),
    Place(
        name = "La3 Club",
        city = "València",
        image = R.drawable.la3,
        isVisited = true,
        points = 4.5f
    ),
    Place(
        name = "Peter Rock Club",
        city = "València",
        image = R.drawable.peter,
        isVisited = false,
        points = 4.4f
    ),
    Place(
        name = "Black Note Club",
        city = "València",
        image = R.drawable.black_note,
        isVisited = true,
        points = 4.7f
    ),
    Place(
        name = "Matisse Club",
        city = "València",
        image = R.drawable.matisse,
        isVisited = false,
        points = 4.5f
    ),
    Place(
        name = "Roig Arena",
        city = "València",
        image = R.drawable.roig_arena,
        isVisited = false,
        points = 4.9f
    ),
    Place(
        name = "Rock City",
        city = "Almàssera",
        image = R.drawable.rock_city,
        isVisited = true,
        points = 4.6f
    ),
    Place(
        name = "Auditorio Marina Norte",
        city = "València",
        image = R.drawable.auditorio_marina_norte,
        isVisited = false,
        points = 4.4f
    ),
    Place(
        name = "Casa de la mar",
        city = "Alboraia",
        image = R.drawable.casa_mar,
        isVisited = false,
        points = 4.1f
    ),
    Place(
        name = "Falkata",
        city = "Gandia",
        image = R.drawable.falkata,
        isVisited = false,
        points = 4.2f
    )
)
