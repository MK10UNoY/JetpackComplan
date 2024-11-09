package com.example.jetpack.HomeScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack.List_options.Take_on_rent
import com.example.jetpack.Navigation.rent_giverent
import com.example.jetpack.Navigation.rent_takerent
import com.example.jetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Rent_options(navController: NavController) {

    Scaffold (

        containerColor = colorResource(id = R.color.bg),


        topBar = {
            TopAppBar(

                modifier = Modifier
                    .border(BorderStroke(1.dp , color = colorResource(id = R.color.black))),
                title = {


                    Text(
                        text = "Rent",
                        color = colorResource(id = R.color.white),
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )


                },

                navigationIcon ={ IconButton(onClick = { navController.navigateUp() }) {

                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null,
                        tint = colorResource(id = R.color.white)
                    )

                } },

                colors = TopAppBarDefaults.topAppBarColors(colorResource(id = R.color.top_bar_col))
            )
        },




        ) {

        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {

            Spacer(modifier = Modifier.height(122.dp))
            Button(
                onClick = {  navController.navigate(rent_takerent)},

                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .padding(16.dp),

                colors = ButtonColors(
                    colorResource(id = R.color.top_bar_col),
                    colorResource(id = R.color.white),
                    colorResource(id = R.color.white),
                    colorResource(id = R.color.white)
                )


            ) {

                Text(text ="Take on Rent", fontWeight = FontWeight.Bold, fontSize = 32.sp)

            }


            Spacer(modifier = Modifier.height(22.dp))


            Button(
                onClick = { navController.navigate(rent_giverent) },

                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .padding(16.dp),


                colors = ButtonColors(
                    colorResource(id = R.color.top_bar_col),
                    colorResource(id = R.color.white),
                    colorResource(id = R.color.white),
                    colorResource(id = R.color.white)
                )


            ) {

                Text(text ="Give on Rent", fontWeight = FontWeight.Bold, fontSize = 32.sp)

            }


        }
    }


}


//
//@Preview(showBackground = true)
//@Composable
//fun prev(){
//    Rent_options()
//}

