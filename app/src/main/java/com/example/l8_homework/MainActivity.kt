package com.example.l8_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    val pi = 3.14
    var arrayList = arrayOf(4 , 45, 234, 234, 23)
    var etFirst : EditText? = null
    var etSecond : EditText? = null
    var etThird : EditText? = null
    var etFourth : EditText? = null
    var etFifth : EditText? = null

    var tvFirst : TextView? = null
    var tvSecond : TextView? = null
    var tvThird : TextView? = null
    var tvFourth : TextView? = null
    var tvFifth : TextView? = null

    var btnUpdate : Button? = null

    private fun initViews(){
        etFirst = findViewById<EditText>(R.id.EtFirstArray)
        etSecond = findViewById<EditText>(R.id.EtSecondArray)
        etThird = findViewById<EditText>(R.id.EtThirdArray)
        etFourth = findViewById<EditText>(R.id.EtFourthArray)
        etFifth = findViewById<EditText>(R.id.EtFifthArray)

        tvFirst = findViewById<TextView>(R.id.TvFirstArray)
        tvSecond = findViewById<TextView>(R.id.TvSecondArray)
        tvThird = findViewById<TextView>(R.id.TvThirdArray)
        tvFourth = findViewById<TextView>(R.id.TvFourthArray)
        tvFifth = findViewById<TextView>(R.id.TvFifthArray)

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

        tvFirst?.text = CircleLength( etFirst?.text.toString().toInt()).toString()
        tvSecond?.text = CircleLength( etSecond?.text.toString().toInt()).toString()
        tvThird?.text = CircleLength( etThird?.text.toString().toInt()).toString()
        tvFourth?.text = CircleLength( etFourth?.text.toString().toInt()).toString()
        tvFifth?.text = CircleLength( etFifth?.text.toString().toInt()).toString()
    }

    private  fun CircleLength (numb : Int) : Double {
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


