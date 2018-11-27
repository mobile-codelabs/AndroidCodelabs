package com.mobile_codelabs.paging.city

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil.ItemCallback
import android.view.LayoutInflater
import android.view.ViewGroup
import com.mobile_codelabs.paging.R
import com.mobile_codelabs.paging.data.City

class CityAdapter : PagedListAdapter<City, CityViewHolder>(CityAdapter.diffCallback) {

    companion object {
        val diffCallback: ItemCallback<City> = object : ItemCallback<City>() {
            override fun areItemsTheSame(oldItem: City?, newItem: City?): Boolean {
                return oldItem?.equals(newItem)!!
            }

            override fun areContentsTheSame(oldItem: City?, newItem: City?): Boolean {
                return areContentsTheSame(oldItem, newItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_city, parent, false))
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


