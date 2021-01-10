package com.example.spyforhire

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.AdapterItem
import layout.Item


class StoreFragment : Fragment(R.layout.fragment_store) {
    var created:Boolean?=false
    var iList = ArrayList<Item>()
    var complete: Boolean = false
    var coins:Int?=null
    private var layoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        if(created==false) {
            iList.add(Item(R.drawable.pistol, "Pistol", 0, 50, false))
            iList.add(Item(R.drawable.sniper_rifle, "Sniper", 0, 250, false))
            iList.add(Item(R.drawable.pistol, "Shotgun", 0, 500, false))
            iList.add(Item(R.drawable.rifle, "Rifle", 0, 1000, false))
            created=true
        }
        if(created==true) {
            iList[0]
            iList[1]
            iList[2]
            iList[3]
        }




        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            view?.findViewById<ImageView>(R.id.settings2)?.setOnClickListener {
                val intent = Intent(activity, Settings::class.java)
                startActivity(intent)
            }
            view?.findViewById<ImageView>(R.id.trophy2)?.setOnClickListener {
                val intent = Intent(activity, Achievements::class.java)
                startActivity(intent)
            }


        }
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        if (recyclerView != null) {
            if (recyclerView != null) {
                recyclerView.adapter = AdapterItem(iList)
            }
            recyclerView.layoutManager = LinearLayoutManager(this.activity)
        }

        }



    }






