package com.example.jetpack.ExampleLists.Data

import com.example.jetpack.R

fun getCycleList() :MutableList<Category>{
    val list= mutableListOf<Category>()

    list.add(Category(R.drawable.cyc1,"Mrinmoy","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc3,"Razeef","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc2,"Shibam","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc1,"Ronak","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc1,"Dhi","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc3,"Mrinmoy","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc2,"Razeef","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc1,"Shibam","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc3,"Ronak","2312123","Rs 100/hr"))
    list.add(Category(R.drawable.cyc3,"Dhi","2312123","Rs 100/hr"))

    return list
}