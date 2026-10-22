package servin.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import servin.examen.domain.Post
import servin.examen.domain.Usuario
import servin.examen.ui.theme.ExamenU2_Carballo_ServinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenU2_Carballo_ServinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Instagram",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

val usuarioEjemplo = Usuario(
    username = "alex.music",
    nombreReal = "Alex | Music & Lifestyle",
    biografia = "🎧 Música, fotos y momentos\n📍 México 🇲🇽\n✨ Creando recuerdos",
    numeroSeguidos = 520,
    verificado = true,
    numeroSeguidores = 12500,
    numeroPosts = 24,
    imagenPerfil = R.drawable.foto_perfil
)

val publicaciones = listOf(
    Post(1250, R.drawable.post_1, "Un momento para recordar ✨"),
    Post(842, R.drawable.post_2, "Mi música, mi mundo 🎧"),
    Post(2310, R.drawable.post_3, "Viviendo el presente 🌅"),
    Post(1567, R.drawable.post_4, "Pequeños detalles, grandes recuerdos 📸"),
    Post(934, R.drawable.post_5, "Días que se sienten eternos ☀️"),
    Post(3421, R.drawable.post_6, "La vida suena mejor con música 🎶"),
    Post(768, R.drawable.post_7, "Un poco de mi mundo 🌎"),
    Post(1890, R.drawable.post_8, "Coleccionando momentos, no cosas 🤍"),
    Post(4520, R.drawable.post_9, "Noches que cuentan historias 🌙"),
    Post(1123, R.drawable.post_10, "Sonríe, todo fluye 😎"),
    Post(2765, R.drawable.post_11, "Entre luces y canciones ✨🎵"),
    Post(653, R.drawable.post_12, "Otro día, otra aventura 🚀"),
    Post(5230, R.drawable.post_13, "Este recuerdo merece quedarse 💫"),
    Post(987, R.drawable.post_15, "Menos prisa, más vida 🌿"),
    Post(3890, R.drawable.post_16, "La playlist de mis mejores días 🎧"),
    Post(2145, R.drawable.post_17, "Un instante, mil emociones 🖤"),
    Post(875, R.drawable.post_18, "Capturando la esencia 📷"),
    Post(6120, R.drawable.post_19, "Qué bonito coincidir con la vida 🌻"),
    Post(1340, R.drawable.post_20, "Modo aventura activado 🗺️"),
    Post(2987, R.drawable.post_21, "Mi energía habla por mí ⚡"),
    Post(743, R.drawable.post_22, "Atardeceres que enamoran 🌇"),
    Post(4210, R.drawable.post_23, "Que nunca falte la buena música 🎼"),
    Post(1678, R.drawable.post_24, "Y todavía quedan historias por contar ❤️")
)


@Composable
fun image(image: String, modifier: Modifier = Modifier) {
    Image(
        imageVector = "$image",
        modifier = modifier
    )
}


@Composable
fun Greeting( name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name!",
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenU2_Carballo_ServinTheme {
        image("${R.drawable.foto_perfil}")
        Greeting( "${usuarioEjemplo.username}")
    }
}