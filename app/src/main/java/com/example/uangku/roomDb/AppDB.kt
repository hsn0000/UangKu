package com.example.uangku.roomDb

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [(User_Entity::class)], version = 1)
abstract class AppDB : RoomDatabase() {

    abstract fun userDAO() : User_DAO
}