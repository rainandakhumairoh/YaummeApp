@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package Page

import Object.Skor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.yaumme_app.R

@Preview
@Composable
fun navbar(navController: NavController){
    val currentBackStackEntry = navController.currentBackStackEntryAsState().value
    val currentDestination = currentBackStackEntry?.destination?.route

    //focus / unfocus
    val berandaResourceId = if (currentDestination == "Dashboard") {
        R.drawable.dashboard_focus
    } else {
        R.drawable.dashboard_unfocus
    }

    val belajarResourceId = if (currentDestination == "TargetMu") {
        R.drawable.target_focus
    } else {
        R.drawable.target_unfocus
    }

    val latihanResourceId = if (currentDestination == "Quran") {
        R.drawable.quran_focus
    } else {
        R.drawable.quran_unfocus
    }

    val profilResourceId = if (currentDestination == "Progres") {
        R.drawable.progres_focus
    } else {
        R.drawable.progres_unfocus
    }

    Box (
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                clip = false
            )
            .fillMaxWidth()
            .height(55.dp)
            .background(color = Color(android.graphics.Color.parseColor("#F7E9C7")))
    ){
        Box(){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .height(25.dp)
                        .width(25.dp)
                        .clickable {
                            navController.navigate("Dashboard")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = berandaResourceId),
                    contentDescription = "Logo Beranda"
                )
                Image(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .height(25.dp)
                        .width(25.dp)
                        .clickable {
                            navController.navigate("TargetMu")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = belajarResourceId),
                    contentDescription = "Logo Target"
                )
                Image(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .height(25.dp)
                        .width(25.dp)
                        .clickable {
                            navController.navigate("Quran")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = latihanResourceId),
                    contentDescription = "Logo Quran"
                )
                Image(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .height(25.dp)
                        .width(25.dp)
                        .clickable {
                            navController.navigate("Progres")
                            Skor.skor.value = 0
                        },
                    painter = painterResource(id = profilResourceId),
                    contentDescription = "Logo Progres"
                )
            }
        }
    }
}