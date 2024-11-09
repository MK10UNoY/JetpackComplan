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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
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
import com.example.jetpack.Navigation.comingsoon1
import com.example.jetpack.Navigation.rentScreen
import com.example.jetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen_main(navController: NavController) {

    Scaffold (

        containerColor = colorResource(id = R.color.bg),


        topBar = {
            TopAppBar(

                modifier = Modifier
                    .border(BorderStroke(1.dp , color = colorResource(id = R.color.black))),
                title = {


                    Text(
                        text = "Title",
                        color = colorResource(id = R.color.white),
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )


                },

                navigationIcon ={ IconButton(onClick = { /*TODO*/ }) {

                    Icon(imageVector = Icons.Filled.Menu, contentDescription = null,
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
                onClick = { navController.navigate(rentScreen)},

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

                Text(text ="Rent", fontWeight = FontWeight.Bold, fontSize = 32.sp)

            }


            Button(
                onClick = { navController.navigate(comingsoon1) },

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

                Text(text ="Buy", fontWeight = FontWeight.Bold, fontSize = 32.sp)

            }

            Button(
                onClick = { navController.navigate(comingsoon1) },

                shape = ButtonDefaults.shape,

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

                Text(text ="Sell", fontWeight = FontWeight.Bold, fontSize = 32.sp)
            }

        }
            }


}





//@Preview(showBackground = true)
//@Composable
//fun pre(){
//    HomeScreen_main()
//}