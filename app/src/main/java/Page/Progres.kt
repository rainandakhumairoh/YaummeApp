@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package Page


//import Object.get_sizehd
import android.annotation.SuppressLint
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.yaumme_app.ui.theme.ui.theme.dmsansFontFamily


@Composable
@Preview
fun topbarProgres(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(87.dp)
            .shadow(
                elevation = 35.dp,
                shape = RoundedCornerShape(
                    bottomStart = 30.dp,
                    bottomEnd = 30.dp
                ),
                clip = false
            ),
        color = Color(android.graphics.Color.parseColor("#457b9d")),
        shape = RoundedCornerShape(
            bottomStart = 30.dp,
            bottomEnd = 30.dp
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = "Progresmu",
                fontSize = 32.sp,
                color = Color.White,
                fontFamily = dmsansFontFamily,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Progres(scrollState: ScrollState, navController: NavController){
    Scaffold(
        topBar = {
            topbarProgres(navController)
        },
        bottomBar = {
            navbar(navController = navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
                .padding(top = 30.dp, start = 30.dp, end = 30.dp, bottom = 0.dp)
                .padding(innerPadding)
            ,
            horizontalAlignment = Alignment.CenterHorizontally

        )
        {
        }
    }
}

