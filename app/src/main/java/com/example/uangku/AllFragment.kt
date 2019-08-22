package com.example.uangku

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.uangku.fragment.FragmentAccount
import com.example.uangku.fragment.FragmentCalendar
import com.example.uangku.fragment.FragmentHome

class AllFragment : AppCompatActivity() {

    val manager = supportFragmentManager

    private lateinit var textMessage: TextView

    val fragmentHome = FragmentHome()
    val fragmentCalendar = FragmentCalendar()
    val fragmentAccount = FragmentAccount()
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.home -> {
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.content, fragmentHome)
                transaction.addToBackStack(null)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.calender -> {
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.content, fragmentCalendar)
                transaction.addToBackStack(null)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }

            R.id.account -> {
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.content, fragmentAccount)
                transaction.addToBackStack(null)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navbot)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val transaction = manager.beginTransaction()
        transaction.replace(R.id.content, fragmentHome)
        transaction.addToBackStack(null)
        transaction.commit()
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

}
