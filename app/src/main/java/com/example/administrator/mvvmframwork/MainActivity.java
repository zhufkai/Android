package com.example.administrator.mvvmframwork;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.mvvmframwork.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    //android.databing
    User user;
    Handler handler=new Handler();
    UserField userField=new UserField();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //不能用 setContentView
//        setContentView(R.layout.activity_main);
        final ActivityMainBinding binding=DataBindingUtil.setContentView(this,R.layout.activity_main);

        user=new User("李四","12345678","http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
        binding.setUser(user);
        binding.setField(userField);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                userField.name.set("sindy");
                userField.password.set("123456978");
            }
        },2000);
    }
}
