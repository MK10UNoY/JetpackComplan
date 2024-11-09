package com.example.jetpack.List_options

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.R

@Composable
fun List_options_list(id :Int ,Img : Int, text : String , onClick :() -> Unit) {

   Card(
       modifier = Modifier
           .fillMaxWidth()
           .padding(
               start = 8.dp,
               top = 15.dp, end = 8.dp
           )
           .height(120.dp)
           .clickable {
               onClick()
           },

    colors = CardDefaults.cardColors(colorResource(id = R.color.white)),

    elevation = CardDefaults.cardElevation(12.dp)

   ){

       Row (
           verticalAlignment = Alignment.CenterVertically
       ){


           Image(
               painter = painterResource(id = Img), contentDescription = "bike",
               modifier = Modifier
                   .fillMaxHeight()
                   .width(180.dp)
           )


           Text(text =text, fontWeight  = FontWeight.Bold)


       }



   }

}


//@Preview
//@Composable
//fun pre(){
//    List_options_list()
//}