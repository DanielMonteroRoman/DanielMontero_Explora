package com.example.explora.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * Contiene la imagen con la configuración necesaria para ser mostrado en una
 * tarjeta de lugar.
 * @author Daniel Montero
 * @param idImage imágenes estarán guardadas en la carpeta de recursos.
 */
@Composable
fun ImagePlace(@DrawableRes idImage:Int, description: String, modifier: Modifier = Modifier) {
        Image(
            painter = painterResource(id=idImage),
            contentDescription = description,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(96.dp)
                .clip(RoundedCornerShape(12.dp))

    )
}