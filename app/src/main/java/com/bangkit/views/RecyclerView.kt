package com.bangkit.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private val datalist = ArrayList<Hero>()

    private val listHeroes: ArrayList<Hero>
        get() {
            val dataName = resources.getStringArray(R.array.data_name)
            val dataDescription = resources.getStringArray(R.array.data_description)
            val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
            val listHero = ArrayList<Hero>()
            for (i in dataName.indices) {
                val hero = Hero(dataName[i],dataDescription[i],dataPhoto.getResourceId(i,-1))
                listHero.add(hero)
            }
            return listHero
        }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(datalist)
        rvHeroes.adapter = listHeroAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        datalist.addAll(listHeroes)
        showRecyclerList()
    }
}