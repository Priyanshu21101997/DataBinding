package com.example.databinding

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

data class User(var age:Int,var name:String,var active:Boolean,var imageUrl:String?) {

    // Handle event click method 2

    fun handleClick(){
        Log.d("TAGGING", "handleClick: ")
    }

    // BindAdaper has to be on static methods
    companion object {
        @JvmStatic
        @BindingAdapter("android:loadImage")
        fun loadImage(imageView: ImageView, imageUrl: String?) {
            Glide.with(imageView.context)
                .load(imageUrl)
                .into(imageView)
        }
    }
}


