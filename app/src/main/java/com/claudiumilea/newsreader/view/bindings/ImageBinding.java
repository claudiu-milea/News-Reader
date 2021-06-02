package com.claudiumilea.newsreader.view.bindings;

import android.graphics.Bitmap;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

class ImageBinding {

    @BindingAdapter({"bitmap"})
    public static void setImageUrl(ImageView imageView, Bitmap bitmap) {
        Glide
                .with(imageView.getContext())
                .load(bitmap)
                .centerCrop()
                .into(imageView);
    }

    @BindingAdapter({"imageUrl", "placeholder"})
    public static void setImageUrl(ImageView imageView, @Nullable String url, @DrawableRes int placeHolder) {
        Glide
                .with(imageView.getContext())
                .load(url)
                .fallback(placeHolder)
                .into(imageView);
    }

}