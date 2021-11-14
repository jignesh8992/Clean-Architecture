package com.jdroid.cleanarchitecture.domain.usecases.offlinecategoryusecases

import com.jdroid.cleanarchitecture.data.repo.JDroidRepo

class UseCaseOfflineCategories(private val repo: JDroidRepo) {

    operator fun invoke() = repo.getOfflineCategory()
}