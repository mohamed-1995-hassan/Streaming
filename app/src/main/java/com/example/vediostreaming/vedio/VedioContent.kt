package com.example.vediostreaming.vedio

class VedioContent(image:Int,link:String,auther:String,content:String) {

    var Image:Int?=null
    var  Link:String?=null
    var  Auther:String?=null
    var  Content:String?=null

    init {
        Image=image
        Link=link
        Auther=auther
        Content=content
    }
}