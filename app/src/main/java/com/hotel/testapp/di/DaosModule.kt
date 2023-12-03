package com.hotel.testapp.di

import com.hotel.testapp.data.local.AppDatabase
import com.hotel.testapp.data.local.dao.HotelDao
import com.hotel.testapp.data.local.dao.RoomsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DaosModule {
    @Provides
    fun provideHotelDao(database: AppDatabase): HotelDao {
        return database.hotelDao()
    }

    @Provides
    fun provideRoomDao(database: AppDatabase): RoomsDao {
        return database.roomsDao()
    }
}