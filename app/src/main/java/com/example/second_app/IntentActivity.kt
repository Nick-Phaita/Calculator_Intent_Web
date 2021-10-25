package com.example.second_app

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.*
import java.util.jar.Manifest
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog


class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        Btn_Email.setOnClickListener {
            email("nickphaita@gmail.com","Application","Hello. I wish to apply for this job.")
        }
        Btn_Share.setOnClickListener {
            share("Nick","Information")
        }
        Btn_Camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent,1)
        }
        Btn_Call.setOnClickListener {
            val int = Intent(Intent.ACTION_CALL,Uri.parse("tel:"+"+254769712646"))
            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    android.Manifest.permission.CALL_PHONE
            )!= PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else{
                startActivity(int)
            }
        }
        Btn_STK.setOnClickListener {
            val simToolKitLaunchIntent = this@IntentActivity.packageManager.getLaunchIntentForPackage("com.android.stk")
            if (simToolKitLaunchIntent != null){
                startActivity(simToolKitLaunchIntent)
            }
        }
        Btn_SMS.setOnClickListener {
            sendSMS("0707600107","Information")
        }
        Btn_Dial.setOnClickListener {
            val phone = Edt_Phone.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone,null))
            if (phone.isEmpty()){
                val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setMessage("Please add a phone number")
                    .setCancelable(false)
                    .setPositiveButton("OK",null)
                val alert: AlertDialog = builder.create()
                alert.show()
            }else{
                startActivity(intent)
            }

        }

    }
}