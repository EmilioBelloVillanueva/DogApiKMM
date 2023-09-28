package com.iterator.dogapikmm.android

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.iterator.comicon.android.databinding.MainActivityBinding
import com.iterator.comicon.presentation.MainViewModel
import dev.icerock.moko.mvvm.MvvmActivity
import dev.icerock.moko.mvvm.createViewModelFactory

class MainActivity : MvvmActivity<MainActivityBinding, MainViewModel>() {
    override val layoutId: Int = R.layout.main_activity
    override val viewModelVariableId: Int = BR.viewModel
    override val viewModelClass: Class<MainViewModel> = MainViewModel::class.java
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.example1()
    }

    override fun viewModelFactory(): ViewModelProvider.Factory {
        return createViewModelFactory { MainViewModel() }
    }
