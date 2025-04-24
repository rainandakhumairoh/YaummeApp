@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.example.yaumme_app.Page

//import Object.Dongeng
//import Object.Hadist
//import Object.get_sizedg
//import Object.get_sizehd
import Page.navbar
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.yaumme_app.R
import com.example.yaumme_app.ui.theme.ui.theme.dmsansFontFamily
import com.example.yaumme_app.ui.theme.ui.theme.leaguespartanFontFamily


@Preview
@Composable
fun box_progres(judul: String = "None"){
    Box(
        modifier = Modifier
            .shadow(
                elevation = 15.dp,
                shape = RoundedCornerShape(
                    bottomStart = 10.dp,
                    bottomEnd = 10.dp
                ),
                clip = false
            )
            .clip(
                RoundedCornerShape(
                    topStart = 10.dp,
                    bottomStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                )
            )
            .height(162.dp)
            .width(205.dp)
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))
    ){
        Column {
            Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 21.dp,
                            bottomStart = 21.dp,
                            topEnd = 21.dp,
                            bottomEnd = 21.dp,
                        )
                    )
                    .padding(5.dp)
                    .height(94.dp)
                    .width(193.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
            ){

            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Box (
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .widthIn(min = 1.dp, max = 10.dp),
                ){
                    Text(


                        text = judul,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                    )
                }

//                Image(
//                    modifier = Modifier
//                        .width(31.dp)
//                        .height(31.dp),
////                    painter = painterResource(id = R.drawable.next_logo),
//                    contentDescription = "nextlogo",
//
//                    )
            }
        }
    }
}

@Preview
@Composable
fun box_progres2(judul: String = "None", route: String, navController: NavController){
    Box(
        modifier = Modifier
            .padding(end = 15.dp , bottom = 10.dp)
            .clickable {
                navController.navigate(route)
            }
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(
                    topStart = 10.dp,
                    bottomStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                ),
                clip = false
            )
            .clip(
                RoundedCornerShape(
                    topStart = 10.dp,
                    bottomStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                )
            )
            .height(138.dp)
            .width(160.dp)
            .background(color = Color(android.graphics.Color.parseColor("#83965F")))
    ){
        Column {
            Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 21.dp,
                            bottomStart = 21.dp,
                            topEnd = 21.dp,
                            bottomEnd = 21.dp,
                        )
                    )
                    .padding(5.dp)
                    .height(80.dp)
                    .width(150.dp)
                    .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
            ){

            }

            Row (
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .widthIn(min = 1.dp, max = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Box (
                    modifier = Modifier
                        .padding(end = 10.dp)
                ){
                    Text(
                        text = judul,
                        color = Color.White,
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                    )
                }

//                Image(
//                    modifier = Modifier
//                        .width(31.dp)
//                        .height(31.dp),
////                    painter = painterResource(id = R.drawable.next_logo),
//                    contentDescription = "nextlogo",
//
//                    )
            }
        }
    }
}

//@Preview
//@Composable
//fun togglebelajar(indikator: Boolean = true, navController: NavController){
//    if (indikator == false){
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
//                .padding(top = 10.dp)
//        ) {
//            Column {
//                LazyRow(
//                ) {
//                    items(get_sizedg()){
//                        box_belajar_2(
//                            judul = Dongeng[it].judul,
//                            route = "Dongeng_$it",
//                            navController = navController
//                        )
//                    }
//                }
//
//            }
//        }
//    }
//    else {
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(color = Color(android.graphics.Color.parseColor("#E8E5DE")))
//                .padding(top = 10.dp)
//        ) {
//            Column {
//                LazyRow(
//                ) {
//                    items(get_sizehd()){
//                        box_belajar_2(
//                            judul = Hadist[it].judul,
//                            route = "Hadist_$it",
//                            navController = navController
//                        )
//                    }
//                }
//
//            }
//        }
//    }
//}


@Preview
@Composable
fun topbar(){
    Row( //Yaumme & logo
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .background(color = Color(android.graphics.Color.parseColor("#F7E9C7")))
            .padding(start = 30.dp, end = 30.dp, top = 30.dp, bottom = 10.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = CenterVertically
    ) {
        Text(
            text = "YAUMME",
            fontSize = 32.sp,
            fontFamily = leaguespartanFontFamily,
            fontWeight = FontWeight.Bold
        )
        Image(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            painter = painterResource(id = R.drawable.logo_yaumme),
            contentDescription = "Logo Image"
        )
    }
}

@Preview
@Composable
fun Dashboard(scrollState: ScrollState, navController: NavController) {
    var indikator by remember { mutableStateOf(false) }
    Scaffold(
        bottomBar = {
            navbar(navController)
        },
        topBar = {
            topbar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#F7E9C7")))
                .padding(start = 30.dp, end = 30.dp, top = 0.dp, bottom = 10.dp)
        ) {
            Box( //Banner
                modifier = Modifier
                    .shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            bottomStart = 20.dp,
                            topEnd = 20.dp,
                            bottomEnd = 20.dp,
                        ),
                        clip = false
                    )
                    .clip(
                        RoundedCornerShape(
                            topStart = 20.dp,
                            bottomStart = 20.dp,
                            topEnd = 20.dp,
                            bottomEnd = 20.dp,
                        )
                    )
                    .fillMaxWidth()
                    .background(color = Color(android.graphics.Color.parseColor("#4F5139")))
                    .height(200.dp)
//                    .clickable {
//                        navController.navigate(rute)
//                    }
            )

            Box( //Terakhir dilihat
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp)
            ) {
                Column {
                    Text(
                        modifier = Modifier.padding(bottom = 10.dp),
                        text = "Target Ibadah",
                        fontFamily = dmsansFontFamily,
                        fontWeight = FontWeight.Bold,
                        color =  Color(android.graphics.Color.parseColor("#4F5139")),
                        fontSize = 16.sp

                    )

//                    box_materi("00.00", "04.34", "Ragam Subjek", "Video_0", navController)
                }
            }

            Box( //Materi
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp)
            ) {
                Column {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ){
                        Text(
                            text = "Misi Harian",
                            fontSize = 16.sp,
                            fontFamily = dmsansFontFamily,
                            color =  Color(android.graphics.Color.parseColor("#4F5139")),
                            fontWeight = FontWeight.Bold)

//                        Text(
//                            text = "Lihat semua",
//                            fontSize = 14.sp,
//                            fontFamily = dmsansFontFamily,
//                            fontWeight = FontWeight.Bold,
//                            color =  Color(android.graphics.Color.parseColor("#457B9D")),
//                            modifier = Modifier
//                                .clickable { navController.navigate("MisiHarian") }
//                        )
                    }
                }
            }

            Box( //Belajar
                modifier = Modifier
                    .padding(top = 25.dp)
            ){
                Column {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ){
                        Text(
                            text = "Progres",
                            fontSize = 16.sp,
                            fontFamily = dmsansFontFamily,
                            color =  Color(android.graphics.Color.parseColor("#4F5139")),
                            fontWeight = FontWeight.Bold)

                        Text(
                            text = "Lihat semua",
                            fontSize = 14.sp,
                            fontFamily = dmsansFontFamily,
                            fontWeight = FontWeight.Bold,
                            color =  Color(android.graphics.Color.parseColor("#83965F")),
                            modifier = Modifier
                                .clickable { navController.navigate("Progres") }
                        )
                    }


                    Row ( // button buat select hadits / dongeng
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .offset(y = (-5).dp)
                    ){
                        Box(){
                            Button(
                                colors = ButtonDefaults.buttonColors(
                                    Color.Transparent
                                ),
                                modifier = Modifier
                                    .clip(
                                        RoundedCornerShape(
                                            topStart = 21.dp,
                                            bottomStart = 21.dp,
                                            topEnd = 21.dp,
                                            bottomEnd = 21.dp,
                                        )
                                    )
                                    .background(
                                        if (!indikator) Color(android.graphics.Color.parseColor("#83965F"))
                                        else Color.Transparent
                                    )
                                    .height(29.dp)
                                    .width(109.dp),
                                onClick = {
                                    indikator = false
                                },
                                shape = if(!indikator) RoundedCornerShape(50)
                                else RoundedCornerShape(100),
                                border = BorderStroke(1.dp, Color(android.graphics.Color.parseColor("#83965F")))
                            ) {
                                Text(
                                    text = "1 Minggu",
                                    fontSize = 12.sp,
                                    color = if (!indikator) Color.White
                                    else Color(android.graphics.Color.parseColor("#83965F")),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .padding(start = 10.dp)
                        ){
                            Button(
                                colors = ButtonDefaults.buttonColors(
                                    Color.Transparent
                                ),
                                modifier = Modifier
                                    .clip(
                                        RoundedCornerShape(
                                            topStart = 21.dp,
                                            bottomStart = 21.dp,
                                            topEnd = 21.dp,
                                            bottomEnd = 21.dp,
                                        )
                                    )
                                    .background(
                                        if (indikator) Color(android.graphics.Color.parseColor("#83965F"))
                                        else Color.Transparent
                                    )
                                    .height(29.dp)
                                    .width(109.dp),
                                onClick = { indikator = true },
                                shape =
                                if(indikator) RoundedCornerShape(50)
                                else RoundedCornerShape(100),
                                border = BorderStroke(1.dp, Color(android.graphics.Color.parseColor("#83965F")))
                            ) {
                                Text(
                                    text = "1 Bulan",
                                    fontSize = 12.sp,
                                    color = if (indikator) Color.White
                                    else Color(android.graphics.Color.parseColor("#83965F")),
                                    fontWeight = FontWeight.Bold
                                )
                            }
//                            Box(modifier = Modifier.padding(bottom = 13.dp).padding(top = 50.dp)) {
//                                box_progres2("None", "Progres1", navController)
//                            }
                        }
                    }
//                    togglebelajar(indikator,navController)
                }
            }
        }
    }
}

@Preview
@Composable
fun box_misi(waktu: String = "00.00",durasi: String = "00.00", judul: String, rute:String, navController: NavController){
    Box(
        modifier = Modifier
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(
                    topStart = 10.dp,
                    bottomStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                ),
                clip = false
            )
            .clip(
                RoundedCornerShape(
                    topStart = 10.dp,
                    bottomStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                )
            )
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#A9C0CF")))
            .height(68.dp)
            .clickable {
                navController.navigate(rute)
            }
        ,
        contentAlignment = Alignment.Center
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = CenterVertically
        ){
            Box {
                Row {
//                    Image(
//                        modifier = Modifier
//                            .height(60.dp)
//                            .width(60.dp),
////                        painter = painterResource(id = R.drawable.buku_1),
//                        contentDescription = "Logo buku"
//                    )
                    Column {
                        Text(
                            text = judul,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Color.White
                        )

                        Text(
                            text = waktu + " / " + durasi,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    }
                }

            }

//            Image(
//                modifier = Modifier
//                    .height(60.dp)
//                    .width(60.dp)
//                    .clickable {
//                        navController.navigate(rute)
//                    },
////                painter = painterResource(id = R.drawable.tombol_play_1),
//                contentDescription = "Logo play",
//
//                )
        }
    }
}
