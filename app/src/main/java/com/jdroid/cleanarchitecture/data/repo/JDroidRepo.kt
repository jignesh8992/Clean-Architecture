package com.jdroid.cleanarchitecture.data.repo

import com.jdroid.cleanarchitecture.common.Constants
import com.jdroid.cleanarchitecture.domain.JDroidAPI
import com.jdroid.cleanarchitecture.domain.models.ModelOfflineCategory

class JDroidRepo : JDroidAPI {

    override fun getOfflineCategory(): MutableList<ModelOfflineCategory> {
        return Constants.getOfflineCategory()
    }
}