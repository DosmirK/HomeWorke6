package com.example.homeworke6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homeworke6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var animeList : ArrayList<Anime>
    private lateinit var animeAdapter : AnimeAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        animeList = ArrayList()
        animeAdapter = AnimeAdapter(animeList)

        binding.rvAnime.layoutManager = LinearLayoutManager(this)
        binding.rvAnime.setHasFixedSize(true)
        binding.rvAnime.adapter = animeAdapter

        loadData()

    }
    private fun loadData() {
        animeList.add(Anime("https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/e63beb56-0433-4bbf-ae70-5d85a5ed8945/576x", "Наруто"))
        animeList.add(Anime("https://avatars.mds.yandex.net/get-mpic/4561793/img_id5815105610982753452.jpeg/orig", "Блич"))
        animeList.add(Anime("https://www.themoviedb.org/t/p/original/9whSxgqSW7dPIIMJyM4WG3BYVo7.jpg", "Атака титанов"))
        animeList.add(Anime("https://www.themoviedb.org/t/p/original/kdkdDl0VZUfOavld4p5qItr35cw.jpg", "Берсерк"))
        animeList.add(Anime("https://cdn.ananasposter.ru/image/cache/catalog/poster/mult/90/3809-1000x830.jpg", "Токийский гуль"))
        animeList.add(Anime("https://www.themoviedb.org/t/p/original/yMYvz4vbKMIXb2IMYYi1GSlNaGx.jpg", "Демоны старшей школы"))
        animeList.add(Anime("https://ae01.alicdn.com/kf/H1c6de31048b74ea799a9116bc84976a1M.jpg", "Мастера меча онлайн"))
        animeList.add(Anime("https://images-s.kinorium.com/movie/poster/2625348/w1500_50169972.jpg", "Токийские мстители"))
        animeList.add(Anime("https://ae04.alicdn.com/kf/Se190f66425a54fdd91be8c90703093dfW.jpg_480x480.jpg", "Клинок рассекающий демонов"))
        animeList.add(Anime("https://media.kg-portal.ru/anime/h/horimiya/posters/horimiya_2.jpg", "Хоримия"))
    }
}