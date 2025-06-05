package com.example.agiota

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Botão Depósito
        val buttonDeposito = findViewById<MaterialButton>(R.id.buttonDeposito)
        buttonDeposito.setOnClickListener {
            val intent = Intent(this, DepositoActivity::class.java)
            startActivity(intent)
            this.onResume()
        }

        // Botão Pagar
        val buttonPagar = findViewById<MaterialButton>(R.id.buttonPagar)
        buttonPagar.setOnClickListener {
            val intent = Intent(this, PagarActivity::class.java)
            startActivity(intent)
            this.onResume()
        }

        // Botão Cofrinho
        val buttonCofrinho = findViewById<MaterialButton>(R.id.buttonCofrinho)
        buttonCofrinho.setOnClickListener {
            val intent = Intent(this, ConfrinhoActivity::class.java)
            startActivity(intent)
            this.onResume()
        }

        // Botão Transferir
        val buttonTransferir = findViewById<MaterialButton>(R.id.buttonTransferir)
        buttonTransferir.setOnClickListener {
            val intent = Intent(this, TransferirActivity::class.java)
            startActivity(intent)
            this.onResume()
        }

        // Botão Desenvolvedor (Grupo)
        val buttonDesenvolvedor = findViewById<MaterialButton>(R.id.buttonDesenvolvedor)
        buttonDesenvolvedor.setOnClickListener { // <-- CORREÇÃO AQUI
            val intent = Intent(this, GrupoActivity::class.java)
            startActivity(intent)
            this.onResume()
        }
    }

    override fun onResume() {
        super.onResume()
        arrayOf(
            findViewById<MaterialButton>(R.id.buttonDeposito),
            findViewById<MaterialButton>(R.id.buttonPagar),
            findViewById<MaterialButton>(R.id.buttonCofrinho),
            findViewById<MaterialButton>(R.id.buttonTransferir),
            findViewById<MaterialButton>(R.id.buttonDesenvolvedor)
        ).forEach { it.isEnabled = true }
    }
}
