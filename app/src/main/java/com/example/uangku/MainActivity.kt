package com.example.uangku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.room.Room
import com.example.uangku.roomDb.AppDB
import com.example.uangku.roomDb.User_Entity

class MainActivity : AppCompatActivity() {
    lateinit var pref: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pref = PrefHelper(this)
//        if (pref.cekStatus()){
//            startActivity(Intent(this,RegisterName::class.java))
//            Toast.makeText(this,"Anda belum punya akun!",Toast.LENGTH_SHORT).show()
//        }else{
//            var nama = intent.getStringExtra("nama")
//            startActivity(Intent(this,AllFragment::class.java))
//            Toast.makeText(this,"Welcome back $nama",Toast.LENGTH_SHORT).show()
//        }

//        var db = Room.databaseBuilder(applicationContext,AppDB::class.java,"UserDB").build()
//
//        Thread{
//            var user = User_Entity()
//            user.user_id = 2
//            user.user_name = "yyy"
//            user.user_balance = 10000000
//
//            db.userDAO().saveUser(user)
//
//            db.userDAO().readDB().forEach {
//                Log.i("@Bontang", """" ID : ${it.user_id}"""")
//                Log.i("@Bontang", """" Name : ${it.user_name}"""")
//                Log.i("@Bontang", """" Balanca : ${it.user_balance}"""")
//            }
//
//        }.start()
    }
}
