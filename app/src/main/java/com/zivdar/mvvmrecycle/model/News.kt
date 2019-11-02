package com.zivdar.mvvmrecycle.model

data class News (val Title :String,val Desc:String){
    override fun toString(): String {
        return "$Title - $Desc"
    }
}