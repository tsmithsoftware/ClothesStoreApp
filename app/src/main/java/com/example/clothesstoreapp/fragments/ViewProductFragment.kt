package com.example.clothesstoreapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clothesstoreapp.R
import com.example.clothesstoreapp.viewmodels.ViewProductViewModel
import timber.log.Timber
import androidx.fragment.app.viewModels

class ViewProductFragment: Fragment() {
    private val birdFancierViewModel by viewModels<ViewProductViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Timber.d("hihihi ${birdFancierViewModel.userId}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.view_product, container, false)
    }
}