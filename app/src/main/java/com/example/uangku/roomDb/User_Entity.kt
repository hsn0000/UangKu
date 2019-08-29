package com.example.uangku.roomDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

class User_Entity {

    @PrimaryKey(autoGenerate = true)
    var user_id : Int = 0

    @ColumnInfo (name = "USER_NAME")
    var user_name : String = ""

    @ColumnInfo (name = "USER_BALANCE")
    var user_balance : Long = 0

}