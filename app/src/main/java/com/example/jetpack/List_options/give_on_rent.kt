package com.example.jetpack.List_options

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack.Navigation.comingsoon1
import com.example.jetpack.R

import com.example.jetpack.ViewModel.getOptions_give_rent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun give_on_rent(navController: NavController) {




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


        Column (modifier = Modifier.padding(it)) {


            LazyColumn(modifier = Modifier.fillMaxSize()) {

                items(getOptions_give_rent()) { item ->
                    List_options_list(id =item.id,Img = item.image, text = item.text , { navController.navigate(
                        comingsoon1)})
                }

            }

        }

    }
}