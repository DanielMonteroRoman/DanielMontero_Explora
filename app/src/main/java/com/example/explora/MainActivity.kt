package com.example.explora

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.Size
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.explora.data.Place
import com.example.explora.ui.screens.PlacesScreeen
import com.example.explora.ui.theme.ExploraTheme



class MainActivity : ComponentActivity() {
    private val TAG ="CicloDeVida"
    //private fun log(m:String)= Log.d("Ciclo", m)
    override fun onCreate(savedInstanceState: Bundle?) { //se ejecuta al iniciar la aplicación
        super.onCreate(savedInstanceState)
        Log.d(TAG, "2. OnCreate: La actividad nace")
        enableEdgeToEdge()
        setContent { //carga el tema del proyecto
            ExploraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Content(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "2. OnStart: La actividad se hace visible")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "3. onResume: La actividad lista para que el usuario interactúe")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "4. onPause: La actividad pierde el foco (empieza a girar)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "5. onStop: La actividad ya no se ve")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "6. onDestroy: La actividad se destruye por completo")
    }


}


@Composable
fun Content(modifier: Modifier = Modifier) {
    var times by rememberSaveable { mutableIntStateOf(0) } //rememberSaveable transforma la variable en una variable de estado.

    PlacesScreeen()

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .then(modifier),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text="primer texto",
//            fontSize = 35.sp,
//            fontWeight = FontWeight.W500
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//        Text(
//            text = "Has hecho clic $times veces",
//            fontSize = 25.sp
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick = {
//            times++
//        }) {
//            Text(
//                text = "¡Púlsame!",
//                fontSize = 30.sp,
//                modifier = Modifier.padding(16.dp)
//            )
//        }
//
//    }
}




