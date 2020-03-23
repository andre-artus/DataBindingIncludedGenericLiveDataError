package com.example.dbigle.ui.main

import android.view.View
import androidx.databinding.BindingAdapter

object BindingAdapters {
    @JvmStatic
    @BindingAdapter("showView")
    fun showView(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("enabled")
    fun showEnabled(view: View, show: Boolean) {
        view.isEnabled = show
    }


}