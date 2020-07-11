package com.example.vediostreaming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vediostreaming.vedio.VedioAdapter
import com.example.vediostreaming.vedio.VedioContent

class MainActivity : AppCompatActivity() {

    var ListContent:ArrayList<VedioContent>?=null
    var Recycler:RecyclerView?=null
    var vedioAdapter:VedioAdapter?=null
    var layoutmaneger:LinearLayoutManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListContent= arrayListOf()
        addList()
        Recycler=findViewById(R.id.rec)
        vedioAdapter= VedioAdapter(this@MainActivity, ListContent!!)
        layoutmaneger= LinearLayoutManager(this@MainActivity)
        Recycler?.layoutManager=layoutmaneger
        Recycler?.adapter=vedioAdapter
    }

    fun addList(){
        ListContent?.add(VedioContent(R.drawable.quran,"EzeWqBlYGhc","Mashary","Islamic"))
        ListContent?.add(VedioContent(R.drawable.kora,"8fuX5iB-U9M","Yall Kora","Football"))
        ListContent?.add(VedioContent(R.drawable.building,"Zd1JT3PsyDw","Gym 4U","Body building"))
        ListContent?.add(VedioContent(R.drawable.natur,"AmBjoKsA2JM","Zagil","Nature"))
        ListContent?.add(VedioContent(R.drawable.paython,"mvZHDpCHphk","Elzero","Paython"))
        ListContent?.add(VedioContent(R.drawable.ciscoo,"eMJHjR63mOo","CISCO","CCNA"))
        ListContent?.add(VedioContent(R.drawable.database,"Do6l420WF4E","S Team","Database"))


    }
}
