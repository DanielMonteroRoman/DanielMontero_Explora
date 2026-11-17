package com.example.explora.ui.screens

import android.content.res.Configuration
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fitInside
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.explora.data.PlacesExample
import com.example.explora.R
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.explora.data.ConcertPlacesExemple
import com.example.explora.data.Place
import com.example.explora.ui.components.CardPlace
import com.example.explora.ui.components.ImagePlace
import com.example.explora.ui.theme.ExploraTheme


/**
 *Organización de la pantalla de la página principal de Explora
 * @author Daniel Montero
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlacesScreeen(){


    //GUARDADO COMO ESTADO:
    val places = remember{ ConcertPlacesExemple.toMutableStateList() } //remember-> aunque la pantalla se actualice, mantén los datos
                                                                //.toMutableSTATEList crea una lista que AVISA  a la IU para que cambie cuando hay cambios en la lista
    var search by rememberSaveable{ mutableStateOf("") }

    //GUARDADO PERO NO COMO ESTADO:
    val filtered = places.filter { it.name.contains(search, ignoreCase = true) }
    val visited = places.filter{it.isVisited}


    @DrawableRes val nameImage = if(isSystemInDarkTheme()){
        R.drawable.name_white
    }else{
        R.drawable.name_black
    }
    //@DrawableRes val logoImage = R.drawable.explora_logo
    @DrawableRes val lupaImage = R.drawable.lupa


    Scaffold(
        topBar={
            CenterAlignedTopAppBar(
                //title = {Text(text="Explora")},
                title={Image(
                    painter = painterResource(id=nameImage),
                    //dImage = lupaImage,
                    contentDescription = "logo",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.height(45.dp)
                )

                }
            )

        }
    )
    { padding: PaddingValues ->
        Column(Modifier
            .padding(padding)
            .padding(16.dp)) {


            OutlinedTextField(
                value = search,
                onValueChange = {search =it},
                label = {Text(text = stringResource(R.string.search))},
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                leadingIcon ={Image(
                    painter = painterResource(id=lupaImage),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(30.dp)

                )

                }
            )






            Text(
                stringResource(R.string.visited, visited.size, places.size),
                modifier = Modifier.padding(top=10.dp))


            LazyColumn(
                modifier= Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {
                items(filtered, key = {place ->place.name}){place-> //para cada elemento de la lista
                    CardPlace(place, onVisitedChange = { marked ->
                        Log.i("TOGLE","El toggle ha sido apretado $marked") //comprobando que los datos llegan correctamente.
                        val i =places.indexOf(place)
                        places[i]=place.copy(isVisited = marked) //EXCEPT OUT OF BOUNDS (places[i+50]), El índice está fuera de rango
                                                                    //EXCEPT ILLEGAL ARGUMENT (places[i+1]), la copia se guarda en una posición diferente (+1) creando dos objetos con misma clave.
                    })

                }


            }


            Text(
                pluralStringResource(
                    id=R.plurals.results_found,
                    count= filtered.size ,
                    filtered.size
                ),
                modifier = Modifier.padding(15.dp))


        }

    }




}

@Preview(locale="es", showBackground=true, name="Claro-español")
@Preview(locale="fr",uiMode = Configuration.UI_MODE_NIGHT_YES, name ="Oscuro-español")
@Preview(name="Catalán", locale="ca")
@Preview(name="francés", locale="fr")
@Preview(name="inglés-", locale="en")
@Preview(name="standard")



@Composable
fun PlacesScreenPreview(){
    ExploraTheme{
       PlacesScreeen()
    }
}