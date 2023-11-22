package com.android.s360_chat_sdk;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class S360ChatWidget extends AppCompatActivity {

    public static void init(Context context, String url) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("url", url);
        context.startActivity(intent);
    }
}
