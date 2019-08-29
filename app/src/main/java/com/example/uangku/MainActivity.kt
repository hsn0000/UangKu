package com.example.uangku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.uangku.roomDb.AppDB
import com.example.uangku.roomDb.User_Entity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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
