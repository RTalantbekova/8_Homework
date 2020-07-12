package com.example.l8_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    private val pi = 3.14
    private var arrayList = arrayOf(4 , 45, 234, 234, 23)
    private var etFirst : EditText? = null
    private var etSecond : EditText? = null
    private var etThird : EditText? = null
    private var etFourth : EditText? = null
    private var etFifth : EditText? = null

    private var tvFirst : TextView? = null
    private var tvSecond : TextView? = null
    private var tvThird : TextView? = null
    private var tvFourth : TextView? = null
    private var tvFifth : TextView? = null

    private var btnUpdate : Button? = null

    private fun initViews(){
        etFirst = findViewById(R.id.EtFirstArray)
        etSecond = findViewById(R.id.EtSecondArray)
        etThird = findViewById(R.id.EtThirdArray)
        etFourth = findViewById(R.id.EtFourthArray)
        etFifth = findViewById(R.id.EtFifthArray)

        tvFirst = findViewById(R.id.TvFirstArray)
        tvSecond = findViewById(R.id.TvSecondArray)
        tvThird = findViewById(R.id.TvThirdArray)
        tvFourth = findViewById(R.id.TvFourthArray)
        tvFifth = findViewById(R.id.TvFifthArray)

        btnUpdate = findViewById(R.id.Update)
    }

    private fun showArray(){

        etFirst?.setText("")
        etSecond?.setText("")
        etThird?.setText("")
        etFourth?.setText("")
        etFifth?.setText("")

        etFirst?.append(arrayList[0].toString())
        etSecond?.append(arrayList[1].toString())
        etThird?.append(arrayList[2].toString())
        etFourth?.append(arrayList[3].toString())
        etFifth?.append(arrayList[4].toString())

        tvFirst?.text = circleLength( etFirst?.text.toString().toInt()).toString()
        tvSecond?.text = circleLength( etSecond?.text.toString().toInt()).toString()
        tvThird?.text = circleLength( etThird?.text.toString().toInt()).toString()
        tvFourth?.text = circleLength( etFourth?.text.toString().toInt()).toString()
        tvFifth?.text = circleLength( etFifth?.text.toString().toInt()).toString()
    }

    private  fun circleLength (numb : Int) : Double {
        val res = numb * pi
        return res
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        showArray()

        btnUpdate?.setOnClickListener {
            arrayList[0] = 2
            arrayList[1] = 15
            arrayList[2] = 17
            arrayList[3] = 98
            arrayList[4] = 88
            showArray()
        }

    }


}


