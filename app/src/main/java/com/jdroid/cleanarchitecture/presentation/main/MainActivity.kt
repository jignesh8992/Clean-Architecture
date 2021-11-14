package com.jdroid.cleanarchitecture.presentation.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.jdroid.cleanarchitecture.data.repo.JDroidRepo
import com.jdroid.cleanarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        val repo = JDroidRepo()
        val factory = MainViewModelFactory(repo)
        val viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)

        Log.i("TAG", "onCreate: " + viewModel.getOfflineCategories())
    }
}