package com.mobile_codelabs.paging.data

import android.arch.paging.ItemKeyedDataSource

class CityDataSource: ItemKeyedDataSource<String, City>() {
    override fun loadInitial(params: LoadInitialParams<String>, callback: LoadInitialCallback<City>) {
        val list = ArrayList<City>()
        list.add(City("1", "Viet Nam", "Ho Chi Minh"))
        list.add(City("2", "Viet Nam", "Ha Noi"))
        list.add(City("3", "Viet Nam", "Da Nang"))
        callback.onResult(list)
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<City>) {
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<City>) {
    }

    override fun getKey(item: City): String {
        return item.id //To change body of created functions use File | Settings | File Templates.
    }
}