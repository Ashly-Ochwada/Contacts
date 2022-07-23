package com.naburi.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.naburi.mycontacts.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var email = intent.extras?.getString("EMAIL")
        var phonenumber = intent.extras?.getString("PHONENUMBER")
        var image = binding.ivProfile


        Toast.makeText(this,"$name: $email: $phonenumber: $address",Toast.LENGTH_LONG).show()
        binding.tvTitus.text = name
        binding.tvNumber.text = phonenumber
        binding.tvGmail.text = email
        binding.tvBox.text = address





    Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)
    }
}