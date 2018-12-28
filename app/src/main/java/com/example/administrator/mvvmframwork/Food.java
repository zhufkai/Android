package com.example.administrator.mvvmframwork;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by Administrator on 2017/3/6 0006.
 */

public class Food {
    private String img;

    private String description;

    private String keywords;

    public Food(String img, String description, String keywords) {
        this.img = img;
        this.description = description;
        this.keywords = keywords;
    }
    @BindingAdapter("bind:img")
    public static void getImage(ImageView view, String url)
    {
        Picasso.with(view.getContext()).load(url).into(view);
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    public  void click(View view)
    {
        Toast.makeText(view.getContext(),getDescription(),Toast.LENGTH_SHORT).show();
    }
}
