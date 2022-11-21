package com.example.intent_whatsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var body:EditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        body=findViewById(R.id.body)
        btn=findViewById(R.id.btn)
        btn.setOnClickListener {
            val a=body.text.toString()
            val intent= Intent(Intent.ACTION_SEND)
            intent.data= Uri.parse(a)
            intent.putExtra(Intent.EXTRA_TEXT,a)
            intent.type="text/plain"
            intent.setPackage("com.whatsapp")
            startActivity(intent)
        }
    }
}