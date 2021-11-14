package com.jdroid.cleanarchitecture.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jdroid.cleanarchitecture.data.repo.JDroidRepo
import com.jdroid.cleanarchitecture.domain.usecases.offlinecategoryusecases.UseCaseOfflineCategories

class MainViewModelFactory(private val repo: JDroidRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(UseCaseOfflineCategories(repo)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class error")
    }
}