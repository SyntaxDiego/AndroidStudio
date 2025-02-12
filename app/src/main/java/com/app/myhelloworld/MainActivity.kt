package com.app.myhelloworld //Definicion del paquete en el que esta el archivo

//El import sirve para traer funciones de otras librerias o modulos
import android.os.Bundle //Necesario para el ciclo de vida de una actividad
import androidx.activity.ComponentActivity //Base de pantalla utilizando compose
import androidx.activity.compose.setContent //Establece la interfaz de un usuario
import androidx.activity.enableEdgeToEdge //Hace que la app utilice toda la pantalla
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box //Funcion Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold //Sirve como contenedor base para la interfaz
import androidx.compose.material3.Text //Componenete para mostrar todo en pantalla
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier //Utilizado para modificar apariencia o comportamiento de componentes dentro del aplicativo
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview //Muestra una vista previa de la UI
import androidx.compose.ui.unit.sp //paquete para hacer cambios en el tamaño de la fuente
import com.app.myhelloworld.ui.theme.MyHelloWorldTheme //Aplica el tema personalizado
import androidx.compose.ui.Alignment // Para centrar el contenido en el Box

//Pantalla completa en Android, el ComponentActivity es nativa de android
class MainActivity : ComponentActivity() {

    //Se llama cuando la pantalla se crea por primera vez
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Funciona para que la app se extienda hasta el borde de la pantalla

        //Define la UI
        setContent {
            MyHelloWorldApp()
        }
    }
}


@Composable
//Aplica el tema de la app, colores, tipografia, etc.
fun MyHelloWorldApp() {
    MyHelloWorldTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = androidx.compose.ui.graphics.Brush.linearGradient(
                        colors = listOf(
                            Color.White,
                            Color.Blue
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Hola Mundo",
                color = Color.Black, //Se le asigna un color al texto
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold, //Se pone en Negrita para resaltar
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview(showBackground = true) //Vista previa de la UI
@Composable
fun MyHelloWorldPreview(){
    MyHelloWorldApp()
}
