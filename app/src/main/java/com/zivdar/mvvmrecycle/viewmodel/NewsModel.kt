package com.zivdar.mvvmrecycle.viewmodel

import com.zivdar.mvvmrecycle.model.News



class NewsModel {

    lateinit var Title: String
    lateinit var Desc: String

    constructor()
    constructor(news: News) {

        this.Title = news.Title
        this.Desc = news.Desc

    }
}