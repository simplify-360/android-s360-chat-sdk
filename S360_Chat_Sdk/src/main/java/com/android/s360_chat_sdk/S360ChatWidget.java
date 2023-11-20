package com.android.s360_chat_sdk;

import android.content.Context;
import android.content.Intent;

public class S360ChatWidget {

    public static void init(Context context, String url) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("url", url);
        context.startActivity(intent);
    }
}
