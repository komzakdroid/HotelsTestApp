package com.hotel.testapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hotel.testapp.data.local.dao.HotelDao
import com.hotel.testapp.data.local.dao.RoomsDao
import com.hotel.testapp.data.local.entities.HotelEntity
import com.hotel.testapp.data.local.entities.RoomsEntity
import com.hotel.testapp.data.local.utils.HotelInfoTypeConvertor

@Database(entities = [HotelEntity::class, RoomsEntity::class], version = 1, exportSchema = false)
@TypeConverters(HotelInfoTypeConvertor::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun hotelDao(): HotelDao

    abstract fun roomsDao(): RoomsDao
}