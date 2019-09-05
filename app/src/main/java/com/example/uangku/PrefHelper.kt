package com.example.uangku

import android.content.Context
import android.content.SharedPreferences

class PrefHelper {
    val COUNTER_ID = "counter"
    val USER_ID = "uidx"

    val statusLogin = "STATUS"

    var mContext: Context
    var sharedSet: SharedPreferences

    constructor(ctx: Context) {
        mContext = ctx
        sharedSet = mContext.getSharedPreferences("APLIKASITESTDB",
                Context.MODE_PRIVATE)
    }

    fun saveID(id: Long) {
        val edit = sharedSet.edit()
        edit.putLong(USER_ID, id)
        edit.apply()
    }

    fun getID(): Long? {
        return sharedSet.getLong(USER_ID, 0)
    }

    fun saveCounterId(counter: Int) {
        val edit = sharedSet.edit()
        edit.putInt(COUNTER_ID, counter)
        edit.apply()
    }

    fun getCounterId(): Int {
        return sharedSet.getInt(COUNTER_ID, 1)
    }

    fun setStatus(status: Boolean) {
        val edit = sharedSet.edit()
        edit.putBoolean(statusLogin, status)
        edit.apply()
    }

    fun cekStatus(): Boolean? {
        return sharedSet.getBoolean(statusLogin, false)
    }
}