package com.findmyage.kyungjoon.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* buFindAge.setOnClickListener{



        }*/
    }

    fun buFindAgeEvent(view: View){
        //버튼이 클릭 되었을떄요..

        val yearOfBitrh:Int = textYearOfBirth.text.toString().toInt();

        var myAge = 2017-yearOfBitrh;

        txtShowAge.text = "내나이는 년도는  "+ myAge;
    }
}
