package com.example.homeworke6

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.example.homeworke6.databinding.ItemAnimeBinding

class AnimeAdapter(private val animeList: ArrayList<Anime>):RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    lateinit var binding: ItemAnimeBinding

    class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val animeImg: ImageView = itemView.findViewById(R.id.img_anime)
        val animeName: TextView = itemView.findViewById(R.id.tv_anime_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.item_anime,
            parent,false)
        return AnimeViewHolder(viewLayout)
    }

    override fun getItemCount(): Int {
        return animeList.size
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val currentAnime = animeList[position]
        Glide.with(holder.animeImg).load(currentAnime.animeImage).into(holder.animeImg)
        holder.animeName.text = currentAnime.animeName
    }
}