package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var imageId: Array<Int>
    private lateinit var names: Array<String>
    private lateinit var information: Array<String>

    private lateinit var recView: RecyclerView
    private lateinit var itemArrayList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
        )

        names = arrayOf(
            "place1",
            "place2",
            "place3",
            "place4",
            "place5",
            "place6",
            "place7",
            "place8",
            "place9",
            "place10",
            "place11",
            "place12",
            "place13",
            "place14",
            "place15",
            "place16",
            "place17",
            "place18",
            "place19",
            "place20",
            "place21",
            "place22",
            "place23",
            "place24"
        )

        information = arrayOf(
            "Casa Loma, Tourist Site, Open Daily",
            "CN Tower, Tourist Site, Open Weekends",
            "ZOO, Tourist Site, Open Weekends",
            "Royal Ontario Museum, Tourist Site, Open Daily and Weekends",
            "Niagara Falls, Tourist Site, Open Daily",
            "Toronto Islands, Tourist Site, Open Daily",
            "Casa Loma, Tourist Site, Open Daily",
            "CN Tower, Tourist Site, Open Weekends",
            "ZOO, Tourist Site, Open Weekends",
            "Royal Ontario Museum, Tourist Site, Open Daily and Weekends",
            "Niagara Falls, Tourist Site, Open Daily",
            "Toronto Islands, Tourist Site, Open Daily",
            "Casa Loma, Tourist Site, Open Daily",
            "CN Tower, Tourist Site, Open Weekends",
            "ZOO, Tourist Site, Open Weekends",
            "Royal Ontario Museum, Tourist Site, Open Daily and Weekends",
            "Niagara Falls, Tourist Site, Open Daily",
            "Toronto Islands, Tourist Site, Open Daily",
            "Casa Loma, Tourist Site, Open Daily",
            "CN Tower, Tourist Site, Open Weekends",
            "ZOO, Tourist Site, Open Weekends",
            "Royal Ontario Museum, Tourist Site, Open Daily and Weekends",
            "Niagara Falls, Tourist Site, Open Daily",
            "Toronto Islands, Tourist Site, Open Daily",
        )


        recView = findViewById(R.id.recView)
        // the type of the recyclerView. linear or grid
        recView.layoutManager = GridLayoutManager(this,3)

        recView.setHasFixedSize(true)


        itemArrayList = arrayListOf()

        getData()

        recView.adapter = RecAadapter(itemArrayList)


    }

    private fun getData() {

        for (i in imageId.indices) {
            val place = Place(imageId[i], names[i], information[i])
            itemArrayList.add(place)
        }
    }
}