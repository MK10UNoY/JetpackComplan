package com.example.jetpack.ViewModel

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.jetpack.R

data class rent_options (
    val id :Int,
    val image : Int,
    val text :String
)



fun getOptions_take_rent(): MutableList<rent_options> {
    var list = mutableListOf<rent_options>()



    list.add(rent_options( 11,R.drawable.bikw, "Rent a Bike"))
    list.add(rent_options( 12,R.drawable.cycle, "Rent a Cycle"))
    list.add(rent_options( 13,R.drawable.gadgets, "Rent a Gadget"))
    list.add(rent_options( 14,R.drawable.others_dog, "Others"))


 return list

}


fun getOptions_give_rent(): MutableList<rent_options> {
    var list_give = mutableListOf<rent_options>()



    list_give.add(rent_options(21,  R.drawable.bikw, "Put your Bike for Rent"))
    list_give.add(rent_options( 22, R.drawable.cycle, "Put your Cycle for Rent"))
    list_give.add(rent_options(23, R.drawable.gadgets, "Put your Gadget for Rent"))
    list_give.add(rent_options( 24,R.drawable.others_dog, "Others"))


    return list_give

}





