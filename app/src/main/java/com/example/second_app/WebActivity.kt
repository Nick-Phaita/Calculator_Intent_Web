package com.example.second_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    private val url = "https://www.google.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        webView.webViewClient = WebViewClient()
        webView.loadUrl(url)
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}














































































































