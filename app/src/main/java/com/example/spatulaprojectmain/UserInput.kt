package com.example.spatulaprojectmain

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import com.example.spatulaprojectmain.UserOutput
import com.example.spatulaprojectmain.databinding.ActivityUserInputBinding
import android.widget.Toast.makeText as toastMakeText

class UserInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //activity_user_input 바인딩
        var binding = ActivityUserInputBinding.inflate(layoutInflater)

        //////////////////////// Spinner Setting//////////////////////////////////////////////////////////////////

        // Spinner 1 세팅 --> 활동 강도 설정
        val spinner1: Spinner = binding.spnActivityLevel
        //create an  ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.activity_level,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner1.adapter = adapter
        }

        //Spinner 2 세팅 --> 신체 타입 설정
        val spinner2: Spinner = binding.spnBodyType
        //create an  ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.body_type,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            //specify the layout use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            //Apply the adapter to the spinner
            spinner2.adapter = adapter
        }

        var activity_level: String = spinner1.selectedItem.toString()
        var body_type: String = spinner2.selectedItem.toString()
        if (activity_level == "숨쉬기 운동") {
            activity_level == 1.2.toString()
        }
        if (activity_level == "주 1~3회 가벼운 운동") {
            activity_level = 1.375.toString()
        }
        if (activity_level == "주 4~5회 가벼운 운동") {
            activity_level = 1.55.toString()
        }
        if (activity_level == "주 3회 빡센 운동/매일 가벼운 운동") {
            activity_level = 1.725.toString()
        }
        if (activity_level == "주 6~7회 빡센 운동") {
            activity_level = 1.9.toString()
        }
    ////////////////////////////////////////////////////////////////////////////////////////////////


        binding.btnA.setOnClickListener {
            var name = binding.etName.text.toString()
            var age: Int = binding.etAge.text.toString().toInt()
            var height: Int = binding.etHeight.text.toString().toInt()
            var weight: Int = binding.etWeight.text.toString().toInt()
            var bmr: Double = 10 * weight + 6.25 * height - 5 * age + 5  // 남녀 추가해야함
            /*var calorie: Int = (bmr * activity_level.toDouble()).toInt()*/
            var intent = Intent(this, UserOutput::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            startActivity(intent)

            //전달할 내용을 저장할 리스트
            val list= mutableListOf<String>()
            intent.putExtra("name", name)
            /*intent.putExtra("kcal", calorie)*/
            /*intent.putExtra("bmr",bmr)*/


            startActivity(intent)

        }
        setContentView(binding.root)
    }
}



class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}
fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

