package com.jdroid.cleanarchitecture.common

import com.jdroid.cleanarchitecture.R
import com.jdroid.cleanarchitecture.domain.models.ModelOfflineCategory

object Constants {
    fun getOfflineCategory(): MutableList<ModelOfflineCategory> {
        val offlineCategory: MutableList<ModelOfflineCategory> = ArrayList()
        offlineCategory.add(ModelOfflineCategory("RC Details", R.mipmap.ic_launcher))
        offlineCategory.add(ModelOfflineCategory("License Details", R.mipmap.ic_launcher))
        offlineCategory.add(ModelOfflineCategory("Challan Details", R.mipmap.ic_launcher))
        offlineCategory.add(ModelOfflineCategory("Financier Details", R.mipmap.ic_launcher))
        return offlineCategory
    }
}
