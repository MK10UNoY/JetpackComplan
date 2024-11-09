package com.example.jetpack.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpack.DetailsScreens.Bike_details
import com.example.jetpack.ExampleLists.BikeRent
import com.example.jetpack.ExampleLists.CycleRent

import com.example.jetpack.HomeScreen.HomeScreen_main
import com.example.jetpack.HomeScreen.Rent_options
import com.example.jetpack.List_options.Take_on_rent
import com.example.jetpack.List_options.give_on_rent
import com.example.jetpack.HomeScreen.comingsoon
import cycle_details

@Composable
fun navHost() {

    val navController : NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = homeScreen) {

        composable(homeScreen){
            HomeScreen_main(navController)
        }

        composable(rentScreen){
            Rent_options(navController)
        }

        composable(rent_takerent){
            Take_on_rent(navController)
        }
        composable(rent_giverent){
            give_on_rent(navController)
        }
        composable(bikesForRent){
          BikeRent(navController)
        }
        composable(cyclesForRent){
            CycleRent(navController)
        }
        composable(bikeDetils){
            Bike_details(navController)
        }
        composable(cycleDetails){
            cycle_details(navController)
        }
        composable(comingsoon1){
            comingsoon(navController)
        }

    }
}




val homeScreen = "home_screen"
val rentScreen = "rent_screen"
val rent_takerent = "take_on_rent"
val rent_giverent= "give_on_rent"
val bikesForRent = "bike_for_rent"
val cyclesForRent= "cycle_for_rent"
val bikeDetils = "bike_details"
val cycleDetails = "cycle_details"
val comingsoon1 = "coming_soon"