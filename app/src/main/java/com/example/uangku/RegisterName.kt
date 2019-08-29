package com.example.uangku

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.uangku.roomDb.AppDB
import com.example.uangku.roomDb.User_Entity
import kotlinx.android.synthetic.main.act_name.*

class RegisterName : AppCompatActivity() {
    lateinit var pref : PrefHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_name)
        pref = PrefHelper(this)

        var db = Room.databaseBuilder(applicationContext, AppDB::class.java, "UserDB").build()


        btn_next1.setOnClickListener {
            Thread {
                var user = User_Entity()

                user.user_name = et_name.text.toString()
                user.user_balance = 0

                val id = db.userDAO().saveUser(user)

                val intent = Intent(this, RegisterBalance::class.java)
                intent.putExtra("id", id)
                intent.putExtra("name", et_name.text.toString())
                startActivity(intent)

                db.userDAO().readDB().forEach {
                    pref.setStatusInput(true)
                    Log.i("@Bontang", """" ID : ${it.user_id}"""")
                    Log.i("@Bontang", """" Name : ${it.user_name}"""")
                    Log.i("@Bontang", """" Balance : ${it.user_balance}"""")
                }
            }.start()
        }

    }
}