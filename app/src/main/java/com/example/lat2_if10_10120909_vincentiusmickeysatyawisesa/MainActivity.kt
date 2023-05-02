//29 April 2023
//Latihan Bloodshare
//10120909
//Vincentius Mickey Satya Wisesa
//IF-10
package com.example.lat2_if10_10120909_vincentiusmickeysatyawisesa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var pindah1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        pindah1 = findViewById(R.id.textView4)

        pindah1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.textView4->{
                val IntenBiasa = Intent(this@MainActivity, Register_Activity::class.java)
                startActivity(IntenBiasa)
            }
        }
    }


}