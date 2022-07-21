package com.haneet.assignment.data.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.haneet.assignment.data.data_model.LocationTable
import com.haneet.assignment.data.room.database.dao.*
import com.haneet.assignment.utils.RoomConverters


import com.whide.partner.networking.tunnel.database.migration.Migration1To2

@Database(
    entities = [LocationTable::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    RoomConverters::class
)

abstract class Database : RoomDatabase() {

    abstract fun getLocationMaster(): LocationDao


    companion object {
        val MIGRATION_1_2 = Migration1To2()
    }
}


