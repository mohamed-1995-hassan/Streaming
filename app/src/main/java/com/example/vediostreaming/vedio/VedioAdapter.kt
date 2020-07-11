package com.example.vediostreaming.vedio

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vediostreaming.R
import com.example.vediostreaming.ShowVedio

class VedioAdapter(con:Context,content:ArrayList<VedioContent>): RecyclerView.Adapter<VedioAdapter.MyHolder>() {
    var Con:Context
    var Content:MutableList<VedioContent>
    init {
        Con=con
        Content=content
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
       var view:View=LayoutInflater.from(Con).inflate(R.layout.contentlayout,parent,false)
        return  MyHolder(view)
    }

    override fun getItemCount(): Int= Content?.size!!

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.Image.setImageResource(Content?.get(position)?.Image!!)
        holder.Tv1.text=Content?.get(position)?.Auther!!
        holder.Tv2.text=Content?.get(position)?.Content!!
    }

    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var Image:ImageView
        var Tv1:TextView
        var Tv2:TextView
        init {
             Image=itemView.findViewById(R.id.mm)
             Tv1=itemView.findViewById(R.id.auther)
             Tv2=itemView.findViewById(R.id.con)
             itemView.setOnClickListener(View.OnClickListener {

                 var intent:Intent= Intent(Con,ShowVedio::class.java)
                 intent.putExtra("tag",Content.get(adapterPosition).Link)
                 Con.startActivity(intent)
             })
        }
    }

}