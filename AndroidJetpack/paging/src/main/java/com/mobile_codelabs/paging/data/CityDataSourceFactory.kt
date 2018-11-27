package com.mobile_codelabs.paging.data

import android.arch.paging.DataSource

class CityDataSourceFactory: DataSource.Factory<String, City>() {
    override fun create(): DataSource<String, City> {
        return CityDataSource()
    }
}