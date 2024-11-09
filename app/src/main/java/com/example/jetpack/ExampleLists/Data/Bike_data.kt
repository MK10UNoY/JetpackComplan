package com.example.jetpack.ExampleLists.Data

import com.example.jetpack.R

data class Category(val img: Int,val name:String,val Schid:String,val price: String)

fun getBikeList() :MutableList<Category>{
    val list= mutableListOf<Category>()

    list.add(Category(R.drawable.bike1,"Mrinmoy","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike2,"Razeef","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike3,"Shibam","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike4,"Ronak","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike1,"Dhi","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike2,"Mrinmoy","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike3,"Razeef","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike4,"Shibam","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike3,"Ronak","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.bike2,"Dhi","2312123","Rs 100/hr"))

    return list
}
