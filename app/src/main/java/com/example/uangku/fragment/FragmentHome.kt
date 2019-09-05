package com.example.uangku.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.uangku.Add_record
import com.example.uangku.PrefHelper
import com.example.uangku.R
import com.example.uangku.roomDb.AppDB
import kotlinx.android.synthetic.main.home.*
import java.util.zip.Inflater

class FragmentHome : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var db = Room.databaseBuilder(activity!!, AppDB::class.java, "UserDB").build()
        db.userDAO().readDB(PrefHelper(activity!!).getID())
        val xnxx = activity!!.intent.getStringExtra("balance")
        tv_balance.text = xnxx

        fab.setOnClickListener{
            startActivity(Intent(activity!!, Add_record::class.java))
        }
    }
}