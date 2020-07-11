package com.example.vediostreaming

import android.os.Bundle
import com.google.android.youtube.player.*

class ShowVedio : YouTubeBaseActivity(),YouTubePlayer.OnInitializedListener {
    var youtube:YouTubePlayerView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_vedio)
        youtube = findViewById(R.id.youtube)
        youtube?.initialize("AIzaSyBATzbcqD_U_g9E0ochx6FEIUdsts4yn_8",this@ShowVedio)
    }
        override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean)
        {
            p1?.loadVideo(intent.extras?.getString("tag"))
        }
        override fun onInitializationFailure(p0: YouTubePlayer.Provider?,p1: YouTubeInitializationResult?)
        {

        }
    }

