package com.example.ejer5pmdmlisteners

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.ejer5pmdmlisteners.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.boton.isEnabled = false

        binding.texto1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.boton.isEnabled = binding.texto1.text.isNotEmpty() && binding.texto2.text.isNotEmpty()

                }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.texto2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.boton.isEnabled = binding.texto1.text.isNotEmpty() && binding.texto2.text.isNotEmpty()

            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.texto1.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                binding.nTexto.text = "1"
            }
        }

            binding.texto2.setOnFocusChangeListener { v, hasFocus ->
                if (hasFocus) {
                    binding.nTexto.text = "2"
                }

            }


        binding.boton.setOnClickListener {
            binding.texto1.setText(binding.texto1.text.toString() + binding.texto2.text.toString())
            binding.texto2.setText("")
        }










        }
    }


