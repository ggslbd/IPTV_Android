package com.example.mytvapp.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytvapp.R
import com.example.mytvapp.modal.Channel

class ChannelViewModel : ViewModel() {


    val channelList = MutableLiveData<List<Channel>>()


    init {
        channelList()
    }


    fun channelList(): LiveData<List<Channel>> {


        val channels = listOf(

            Channel(
                "Al Jazeera",
                R.drawable.aljazeera,
                "https://live-hls-web-aja.getaj.net/AJA/index.m3u8"
            ),

            Channel(
                "CNN", R.drawable.cnn,
                "https://cnn-cnninternational-1-eu.rakuten.wurl.tv/playlist.m3u8"

            ),
            Channel(
                "TRTW", R.drawable.trtworld,
                "https://tv-trtworld.medya.trt.com.tr/master.m3u8"
            ),
            Channel(
                "DW", R.drawable.dw,
                "https://dwamdstream102.akamaized.net/hls/live/2015525/dwstream102/index.m3u8"
            ),
            Channel(
                "RT", R.drawable.rt_do,
                "https://news.cgtn.com/resource/live/document/cgtn-doc.m3u8"
            ),

            Channel(
                "Wild Earth",  R.drawable.wildarth,
                "https://wildearth-roku.amagi.tv/masterR720P.m3u8"
            ),
            Channel(
                "Horse", R.drawable.horse,
                "https://hncfree-samsungau.amagi.tv/playlist.m3u8"
            ),

            Channel(
                "Sky ", R.drawable.skycricket,
                "https://ythls.armelin.one/channel/UCoMdktPbSTixAyNGwb-UYkQ.m3u8"
            ),

            Channel(
                "Drama 1", R.drawable.adrama,
                "https://weyyak-live.akamaized.net/weyyak_drama/index.m3u8"
            ),
            Channel(
                "A Music", R.drawable.tentvlogo,
                "https://albportal.net/albkanalemusic.m3u8"
            ),


            Channel(
                "TRT Toon", R.drawable.trtcocuk,
                "https://tv-trtcocuk.medya.trt.com.tr/master.m3u8"
            ),


            Channel(
                "Belgesel", R.drawable.trtbelgesel,
                "https://tv-trtbelgesel.medya.trt.com.tr/master.m3u8"
            ),

            Channel(
                "TRTAvaz", R.drawable.trtavaz,
                "https://tv-trtavaz.medya.trt.com.tr/master.m3u8"
            ),

            Channel(
                "TRTKurdi",  R.drawable.trtkurdi,
                "https://tv-trtkurdi.medya.trt.com.tr/master.m3u8"
            ),

            // BACKUP CGTTN  https://livedoc.cgtn.com/500d/prog_index.m3u8


            Channel(
                "FRENCE24", R.drawable.france24,
                "https://ythls.armelin.one/channel/UCQfwfsi5VrQ8yKZ-UWmAEFg.m3u8"
            ),

            Channel(
                "LIVE NOW",
                R.drawable.foxliveow,
                ""
            ),

            Channel(
                "TEN SPORTS",
                R.drawable.ten,
                ""
            ),

            Channel(
                "Sony 1", R.drawable.sonytenone,
                ""
            ),

            Channel(
                "Sony 5", R.drawable.sonytenfive,
                ""
            ),

            Channel("SONY TV", R.drawable.sony, ""),



            Channel(
                "INVESTIGATION", R.drawable.discoveryinvestigation,
                ""
            ),


            Channel("DISCOVERY", R.drawable.discovery, ""
            ),



            //



            Channel(
                "NAT GEO",
                R.drawable.nationalgeo,
                ""
            ),

            Channel(
                "NAT WILD",
                R.drawable.natgeowild,
                ""
            ),

            // discovery scienece


            Channel(
                "HISTORY",
                R.drawable.history,
                ""
            ),




            Channel(
                "BBC FOUR", R.drawable.bbcfour,
                "https://timeline-samsung-uk.amagi.tv/playlist720-p.m3u8"
            ),


            Channel(
                "CBN", R.drawable.cbn,
                " "
            ),


            Channel(
                "REAL STORIES", R.drawable.realstories,
                ""
            ),


            Channel(
                "ABC", R.drawable.abc,
                ""
            ),

            Channel("TLC", R.drawable.tlc, "")
        )




        channelList.value = channels


        return channelList


    }


}
