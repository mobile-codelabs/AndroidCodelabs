package com.mobile_codelabs.paging.city

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import com.mobile_codelabs.paging.data.City
import com.mobile_codelabs.paging.data.CityDataSourceFactory

class CitiesViewModel() : ViewModel() {
    val mobileCodeLabsTitle: String = "Mobile Code Labs"
    val pagedCities: LiveData<PagedList<City>>

    init {
        pagedCities = LivePagedListBuilder(CityDataSourceFactory(), 20).build()
    }
}