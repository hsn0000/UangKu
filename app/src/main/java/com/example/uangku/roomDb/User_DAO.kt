package com.example.uangku.roomDb

import androidx.room.*

@Dao
interface User_DAO {

    @Insert
    fun saveUser(user: User_Entity) : Long

    @Update
    fun updateDB(user : User_Entity)

    @Query("select * from User_Entity")
    fun readDB(): List<User_Entity>

    @Query("select * from User_Entity where user_id = :id")
    fun readDB(id : Long): List<User_Entity>
}