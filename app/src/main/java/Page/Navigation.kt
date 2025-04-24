package Page

//import com.tech.ngalodern.Page.Profile
import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.yaumme_app.Page.Dashboard

@Composable
fun Navigation(scrollState: ScrollState) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Dashboard") {
        composable("Dashboard") {
            Dashboard(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("TargetMu") {
            TargetMu(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("MisiHarian") {
            MisiHarian(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("Progres") {
            Progres(
                scrollState = scrollState,
                navController = navController
            )
        }

        composable("Quran") {
            Quran(
                scrollState = scrollState,
                navController = navController
            )
        }
    }
}

//        val dongengList = get_Dongeng()
//        dongengList.forEachIndexed() { index, dongeng ->
//            composable("Dongeng_$index"){
//                dongeng.board(
//                    scrollState = scrollState,
//                    navController = navController
//                )
//            }
//        }
//
//        val hadistList = get_Hadist()
//        hadistList.forEachIndexed() { index, hadist ->
//            composable("Hadist_$index"){
//                hadist.board(
//                    scrollState = scrollState,
//                    navController = navController
//                )
//            }
//        }
//
//        val soalList11 = get_Soal_11()
//        val soalList12 = get_Soal_12()
//        val soalList13 = get_Soal_13()
//        val soalList21 = get_Soal_21()
//        val soalList22 = get_Soal_22()
//
//        soalList11.forEachIndexed() { index, soal ->
//            composable("Soal1_1_$index"){ soal.board(scrollState = scrollState, navController = navController) } }
//        soalList12.forEachIndexed() { index, soal ->
//            composable("Soal1_2_$index"){ soal.board(scrollState = scrollState, navController = navController) } }
//        soalList13.forEachIndexed() { index, soal ->
//            composable("Soal1_3_$index"){ soal.board(scrollState = scrollState, navController = navController) } }
//        soalList21.forEachIndexed() { index, soal ->
//            composable("Soal2_1_$index"){ soal.board(scrollState = scrollState, navController = navController) } }
//        soalList22.forEachIndexed() { index, soal ->
//            composable("Soal2_2_$index"){ soal.board(scrollState = scrollState, navController = navController) } }
//
//        composable("Tingkat_0") { Tingkat_1(scrollState = scrollState, navController = navController) }
//        composable("Tingkat_1") { Tingkat_2(scrollState = scrollState, navController = navController) }
//
//        composable("FinalSkor") {
//            FinalSkor(
//                scrollState = scrollState,
//                navController = navController
//            )
//        }
//
//        val videoList = get_Video()
//        videoList.forEachIndexed() { index, video ->
//            composable("Video_$index"){
//                video.VideoPage(
//                    scrollState = scrollState,
//                    navController = navController,
//                    videoUrl = video.videoUrl
//                )
//            }
//        }
//
//        val modulList = get_Modul()
//        modulList.forEachIndexed() { index, modul ->
//            composable("Modul_$index"){
//                modul.boardmateri(
//                    scrollState = scrollState,
//                    navController = navController
//                )
//            }
//        }
//    }
//}