package com.example.explora.ui.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import com.example.explora.data.Place

/**
 * Representa una tarjeta visual en la pantalla del dispositivo
 * con información de cada lugar de la lista
 *
 * @author Daniel Montero
 * @param  place un objeto de la data class Place (contiene nombre, ciudad, puntuación e imagen)
 * @param onVisitedChange función que tiene como parámetro un booleano dependiendo de la interacción del usuario con el check box
 */
@Composable
fun CardPlace(place: Place, onVisitedChange: (Boolean) -> Unit): Unit{ //->Unit es una función void.
    Card(modifier = Modifier.fillMaxWidth()){
        Row(
            modifier=Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImagePlace(place.image, place.name)
            Column(modifier=Modifier.weight(1f).padding(horizontal=12.dp)){

                Text(place.name, style = MaterialTheme.typography.titleMedium)
                Text(place.city, style= MaterialTheme.typography.bodyMedium)
            }

            Column() {
                Text(text=place.points.toString())
            }

            Checkbox(checked = place.isVisited, onCheckedChange = onVisitedChange)

        }
    }

}