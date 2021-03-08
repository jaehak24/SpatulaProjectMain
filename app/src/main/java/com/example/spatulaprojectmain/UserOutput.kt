package com.example.spatulaprojectmain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spatulaprojectmain.databinding.ActivityUserOuputBinding


class UserOutput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityUserOuputBinding.inflate(layoutInflater)
        intent.getStringExtra("bmr")?.let { toastShort(it) }




        if(intent.hasExtra("name"))
        {

            binding.tvGetName.text = intent.getStringExtra("name")
        }
        if(intent.hasExtra("calorie"))
        {
            binding.tvGetKcal.text = intent.getStringExtra("calorie")
        }

        if(intent.hasExtra("bmr"))
        {
            binding.tvGetBmr.text=intent.getStringExtra("bmr")

        }
        setContentView(binding.root)

    }
}