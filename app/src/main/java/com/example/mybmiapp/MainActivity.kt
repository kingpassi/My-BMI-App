package com.example.mybmiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtWeight=findViewById<EditText>(R.id.edtweight)
        val edtHeightFt=findViewById<EditText>(R.id.edtHeightFt)
        val edtHeightInc=findViewById<EditText>(R.id.edtHeightInc)
        val btnCalculate=findViewById<Button>(R.id.btnCalculate)
        val tvResult=findViewById<TextView>(R.id.tvResult)
        val llMain=findViewById<LinearLayout>(R.id.llMain)

       btnCalculate.setOnClickListener{

           val wt= Integer.parseInt(edtWeight.text.toString())
           val ft= Integer.parseInt(edtHeightFt.text.toString())
           val Inc=Integer.parseInt(edtHeightInc.text.toString())

           val totalIn = ft*12+Inc
           val totalCm = totalIn*2.53
           val totalM = totalCm/100

           val bmi=wt/ totalM.pow(2.0)

           if(bmi>25){
               tvResult.text = "You're OverWeight"
               llMain.setBackgroundResource(R.drawable.redbg)
           }
           else if(bmi<18){
               tvResult.text = "You're UnderWeight"
               llMain.setBackgroundResource(R.drawable.yellowbg)
           }
           else{
               tvResult.text = "You're Healthy!! "
               llMain.setBackgroundResource(R.drawable.greenbg)

           }

       }



    }
}