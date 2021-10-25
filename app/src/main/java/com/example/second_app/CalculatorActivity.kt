package com.example.second_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Btn_Add.setOnClickListener {
            //receive entered data from the user
            var fnum = Edt_Fnum.text.toString()
            var snum = Edt_Snum.text.toString()

            //checking entered data
            if (fnum.isEmpty()or snum.isEmpty()){
                Txt_Answer.text= "Please fill in all the details."
            }
            else{
                var answer = fnum.toDouble() + snum.toDouble()
                Txt_Answer.text = answer.toString()
            }
        }

       Btn_Subtract.setOnClickListener {
           //receive entered data from the user
           var fnum = Edt_Fnum.text.toString()
           var snum = Edt_Snum.text.toString()

           //checking entered data
           if (fnum.isEmpty()or snum.isEmpty()){
               Txt_Answer.text= "Please fill in all the details."
           }
           else{
               var answer = fnum.toDouble() - snum.toDouble()
               Txt_Answer.text = answer.toString()
           }
       }

        Btn_Multiply.setOnClickListener {
            //receive entered data from the user
            var fnum = Edt_Fnum.text.toString()
            var snum = Edt_Snum.text.toString()

            //checking entered data
            if (fnum.isEmpty()or snum.isEmpty()){
                Txt_Answer.text= "Please fill in all the details."
            }
            else{
                var answer = fnum.toDouble() * snum.toDouble()
                Txt_Answer.text = answer.toString()
            }
        }

        Btn_Divide.setOnClickListener {
            //receive entered data from the user
            var fnum = Edt_Fnum.text.toString()
            var snum = Edt_Snum.text.toString()

            //checking entered data
            if (fnum.isEmpty()or snum.isEmpty()){
                Txt_Answer.text= "Please fill in all the details."
            }
            else{
                var answer = fnum.toDouble() / snum.toDouble()
                Txt_Answer.text = answer.toString()
            }
        }

    }
}