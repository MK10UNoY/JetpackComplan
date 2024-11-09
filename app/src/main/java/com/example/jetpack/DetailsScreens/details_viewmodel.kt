package com.example.jetpack.DetailsScreens

import com.example.jetpack.R
import com.example.jetpack.ViewModel.rent_options

data class Detail(val img:Int,val name:String,val schid: String,val price: String,val no: String,val Wno: String,val prodDisc: String)


fun getDetails_bike(): MutableList<Detail> {
    val listBike= mutableListOf<Detail>()
    listBike.add(Detail(
        img = R.drawable.bike2,
        name = "Shiva",
        schid = "          2312123",
        price = "Rs :                    120/hr",
        no = "     +91 6834567890",
        Wno = "+91 9276543210",
        prodDisc = "Well-Maintained\n" +
                "Smooth Gears\n" +
                "Reliable Brakes\n" +
                "Comfortable Seat\n"+
                "Fully Lubricated Chain"

    ))

return listBike
}

fun getDetails_cycle(): MutableList<Detail> {

    val listCycle= mutableListOf<Detail>()
    listCycle.add(Detail(
        img = R.drawable.cyc1,
        name = "Aditya Kapoor",
        schid = "          2213058",
        price = "Rs :                    20/hr",
        no = "     +91 6834567890",
        Wno = "+91 9276543210",
        prodDisc = "Smooth Suspension\n" +
                "Wide Tires\n" +
                "Reliable Brakes\n" +
                "Comfortable Seat\n"+
                "Adjustable Handlebars\n"+
                "Adjustable Pedals"
    ))

    return listCycle
}
