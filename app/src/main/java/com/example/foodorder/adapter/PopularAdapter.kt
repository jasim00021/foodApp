package com.example.foodorder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorder.databinding.PopularItemBinding

class PopularAdapter(private val items:List<String>, private val image:List<Int>, private val price: List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {




    override fun getItemCount(): Int {
      return items.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
      val item = items[position]
        val images = image[position]
    val price = price[position]
        holder.bind(item,images,price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
       return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    class PopularViewHolder(private val binding: PopularItemBinding):RecyclerView.ViewHolder(binding.root) {
      private   val imageView = binding.foodImagePopular
        fun bind(item: String, images: Int, price: Int) {
           binding.foodnamePopular.text = item
            binding.foodpricePopular.text = price.toString()
            imageView.setImageResource(images)
        }

    }
}