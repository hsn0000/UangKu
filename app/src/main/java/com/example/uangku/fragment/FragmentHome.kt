package com.example.uangku.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uangku.Add_record
import com.example.uangku.R
import kotlinx.android.synthetic.main.home.*
import java.util.zip.Inflater

class FragmentHome : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val xnxx = activity!!.intent.getStringExtra("balance")
        tv_balance.text = xnxx

        fab.setOnClickListener{
            startActivity(Intent(activity!!, Add_record::class.java))
        }
    }
}