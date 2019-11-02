package com.zivdar.mvvmrecycle.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zivdar.mvvmrecycle.databinding.NewsBInding
import com.zivdar.mvvmrecycle.viewmodel.NewsModel


class CustomeAdapter : RecyclerView.Adapter<CustomeAdapter.CviewHolder>() {

    var lisNews: MutableList<NewsModel> = mutableListOf()
    lateinit var layoutInflater: LayoutInflater
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CviewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        val newsBinding: NewsBInding = NewsBInding.inflate(layoutInflater, parent, false)
        return CviewHolder(newsBinding)

    }

    override fun getItemCount(): Int {
        return lisNews.size
    }

    fun setData(lisNews: MutableList<NewsModel>) {
        this.lisNews = lisNews
    }

    override fun onBindViewHolder(holder: CviewHolder, position: Int) {
        val newsModel = lisNews[position]
        holder.bind(newsModel)
    }

    inner class CviewHolder(private val newsBinding: NewsBInding) :
        RecyclerView.ViewHolder(newsBinding.root) {
        fun bind(newsModel: NewsModel) {
            this.newsBinding.newsView = newsModel
        }

    }
}