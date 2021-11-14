package com.jdroid.cleanarchitecture.domain

import com.jdroid.cleanarchitecture.domain.models.ModelOfflineCategory

interface JDroidAPI {
    fun getOfflineCategory(): MutableList<ModelOfflineCategory>
}