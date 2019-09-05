package com.example.uangku

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.uangku.roomDb.AppDB
import com.example.uangku.roomDb.User_Entity
import kotlinx.android.synthetic.main.act_begin_ballance.*
import kotlinx.android.synthetic.main.act_currency.*

class RegisterBalance : AppCompatActivity() {
    lateinit var pref: PrefHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_begin_ballance)
        pref = PrefHelper(this)
        var db = Room.databaseBuilder(applicationContext, AppDB::class.java, "UserDB").build()

        if (pref.cekStatus()!!) {
            startActivity(Intent(this, AllFragment::class.java))
            finish()
        } else {

        }

        btn_next2.setOnClickListener {
            Thread {
                pref.setStatus(true)

                var user = User_Entity()
                user.user_id = intent.getLongExtra("id", 0).toInt()
                user.user_name = intent.getStringExtra("name")
                user.user_balance = et_uang.text.toString().toLong()

                db.userDAO().updateDB(user)

                val intent = Intent(this, AllFragment::class.java)
                Log.d("balanceee",user.user_balance.toString())
                intent.putExtra("balance",user.user_balance.toString())
                startActivity(intent)

                db.userDAO().readDB().forEach {
                    Log.i("@Bontang", """" ID : ${it.user_id}"""")
                    Log.i("@Bontang", """" Name : ${it.user_name}"""")
                    Log.i("@Bontang", """" Balance : ${it.user_balance}"""")
                }
            }.start()
        }
    }
}