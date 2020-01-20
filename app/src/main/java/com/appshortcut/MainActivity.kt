package com.appshortcut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // for Shortcut Intent Filter
        intent?.let {
            if (it.extras != null) {
                when(it.extras?.get("shortcutAction")){
                    "voice"->{
                        Toast.makeText(this,"Voice Shortcut Clicked",Toast.LENGTH_LONG).show()
                    }
                    "main"->{
                        Toast.makeText(this,"Main Shortcut Clicked",Toast.LENGTH_LONG).show()
                    }
                    "selfie"->{
                        Toast.makeText(this,"Selfie Shortcut Clicked",Toast.LENGTH_LONG).show()
                    }

                }
            }
        }

    }
}
