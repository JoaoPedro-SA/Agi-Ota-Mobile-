package com.example.agiota

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class GrupoActivity : AppCompatActivity() {

    private lateinit var buttonV: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quem_somos)

        buttonV = findViewById(R.id.buttonV)
        buttonV.setOnClickListener {
            val intent = Intent(this, HomerActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        buttonV.isEnabled = true
    }
}
