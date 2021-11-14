package com.jdroid.cleanarchitecture.presentation.main

import androidx.lifecycle.ViewModel
import com.jdroid.cleanarchitecture.domain.usecases.offlinecategoryusecases.UseCaseOfflineCategories

class MainViewModel(private val useCaseOfflineCategories: UseCaseOfflineCategories) : ViewModel() {
    fun getOfflineCategories() = useCaseOfflineCategories()
}