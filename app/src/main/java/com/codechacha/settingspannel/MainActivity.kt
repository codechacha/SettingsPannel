package com.codechacha.settingspannel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInternet.setOnClickListener {
            val panelIntent = Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY)
            startActivity(panelIntent)
        }
        btnWifi.setOnClickListener {
            val panelIntent = Intent(Settings.Panel.ACTION_WIFI)
            startActivity(panelIntent)
        }
        btnNfc.setOnClickListener {
            val panelIntent = Intent(Settings.Panel.ACTION_NFC)
            startActivity(panelIntent)
        }
        btnVolume.setOnClickListener {
            val panelIntent = Intent(Settings.Panel.ACTION_VOLUME)
            startActivity(panelIntent)
        }
    }
}
