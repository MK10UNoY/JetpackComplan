package com.example.jetpack.ExampleLists

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack.ExampleLists.Data.Category
import com.example.jetpack.ExampleLists.Data.getBikeList
import com.example.jetpack.Navigation.bikeDetils
import com.example.jetpack.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun BikeRent(navController: NavController) {

    Scaffold(

        containerColor = colorResource(id = R.color.bg),


        topBar = {
            TopAppBar(

                modifier = Modifier
                    .border(BorderStroke(1.dp, color = colorResource(id = R.color.black))),
                title = {


                    Text(
                        text = "Rent",
                        color = colorResource(id = R.color.white),
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )


                },

                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {

                        Icon(
                            imageVector = Icons.Filled.ArrowBack, contentDescription = null,
                            tint = colorResource(id = R.color.white)
                        )

                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(colorResource(id = R.color.top_bar_col))
            )
        },


        ) {

        Column(modifier = Modifier.padding(it)) {


            LazyColumn {
                items(getBikeList()) { item ->
                    Block(
                        img = item.img,
                        name = item.name,
                        schid = item.Schid,
                        price = item.price
                    ) {
                        navController.navigate(bikeDetils)
                    }

                }
            }
        }





    }

}


@Composable
fun Block(img: Int, name: String, schid: String, price: String , onClick : () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(Color(717070))
            .clickable { onClick() }

            ,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 8.dp,
            disabledElevation = 0.dp
        )

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.White)
                .padding(8.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .height(8.dp)
                    .background(Color.Gray)
            )
            Image(
                painter = painterResource(id = img),
                contentDescription = " ",
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(69.dp)
                    .weight(.3f)

            )
            Column(Modifier.weight(.8f)) {

                Text(
                    text = "Owner details:",
                    fontSize = 10.sp,
                    color = Color.Gray
                )
                Text(
                    text = name,
                    style = MaterialTheme.typography.titleLarge
                )
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Text(text = "Sch ID: ")
                    Text(
                        text = schid,
                        color = Color.Gray,
                        fontSize = 20.sp
                    )
                }
                Row {
                    Text(
                        text = price
                    )


                    Text(text = "Click to view \n More details", fontSize = 12.sp, modifier = Modifier.padding(start=92.dp))

//                    Button(
//                        onClick = {onClick() }, enabled = false,
//                        colors = ButtonColors(
//                            colorResource(id = R.color.purple_500),
//                            colorResource(id = R.color.purple_500),
//                            colorResource(id = R.color.purple_500),
//                            colorResource(id = R.color.white)
//                        )
//                    )
//                    {
//                        Text(text = "Enter")
//                    }
                }

            }
        }
    }
}



