package com.s360example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.s360_chat_sdk.S360ChatWidget
import com.s360example.ui.theme.S360ExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebViewContainer: S360ChatWidget = findViewById(R.id.s360ChatWidget)
        myWebViewContainer.loadUrl("https://live-chat-static.sprinklr.com/chat/page/floLbo9_o/index.html?appId=60c1d169c96beb5bf5a326f3_app_950954&device=MOBILE&enableClose=true&zoom=false")


    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        S360ExampleTheme {
            Greeting("Android")
        }
    }
}