package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf<String>("Chinese", "Pizza", "Noodles", "McDonalds", "Sushi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddFood.setOnClickListener(){
            val newFood = etAddFood.text.toString()
            foodList.add(newFood)
            etAddFood.text.clear()
            Log.println(Log.DEBUG, "FOOD LIST ITEM ADDED", foodList.toString())
        }

        btnDecide.setOnClickListener(){
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            tvSelectedFood.text = foodList[randomFood]
            Log.println(Log.INFO, "CURRENT FOOD LIST", foodList.toString())
        }



    }
}
