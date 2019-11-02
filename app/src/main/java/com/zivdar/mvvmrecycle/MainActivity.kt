package com.zivdar.mvvmrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zivdar.mvvmrecycle.adapter.CustomeAdapter
import kotlinx.android.synthetic.main.activity_main.*
import com.zivdar.mvvmrecycle.viewmodel.NewsModel



 class MainActivity : AppCompatActivity() {
    var lisNews: MutableList<NewsModel> = mutableListOf()

  lateinit var  customeAdapter:CustomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        recycle_main.layoutManager= LinearLayoutManager(this)
        recycle_main.layoutManager =  LinearLayoutManager(this)
//
        customeAdapter=CustomeAdapter()
        recycle_main.adapter=customeAdapter
//
        setData()
        customeAdapter.setData(lisNews)


    }

    private fun setData() {

        val newsModel = NewsModel()
        newsModel.Title = "First Title "
        newsModel.Desc = "This is first title "

        lisNews.add(newsModel)


        val newsModel1 = NewsModel()
        newsModel1.Title = "Second Title "
        newsModel1.Desc = "This is second title "

        lisNews.add(newsModel1)


    }

}
