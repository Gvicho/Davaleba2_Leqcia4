package com.example.davaleba2_leqcia4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    private lateinit var btn1: Button
    private lateinit var edit_1: EditText
    private lateinit var txt1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_1 = findViewById<EditText>(R.id.edit_1)
        btn1 = findViewById<Button>(R.id.btn1)
        txt1 = findViewById<TextView>(R.id.txt1)

        btn1.setOnClickListener{
            val num :Int = getInput()
            if(num!=0){
                val ans:String = handleInput(num)
                outputText(ans)
            }
        }
    }
    private fun getInput():Int{
        val editTextValue = edit_1.text.toString()

        if (editTextValue.isNotEmpty()) {
            try {
                val num = editTextValue.toInt()
                if(num>0 && num<=1000)return num
                else {
                    Toast.makeText(this, "Out off range [1..1000]", Toast.LENGTH_SHORT).show()
                    return 0
                }
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Invalid integer input", Toast.LENGTH_SHORT).show()
                return 0
            }
        } else {
            Toast.makeText(this, "EditText is empty", Toast.LENGTH_SHORT).show()
            return 0
        }
    }

    private fun handleInput(num :Int):String{
        var arr: Array<Int> = emptyArray<Int>()
        var num1 = num
        while(num1>0){
            arr+=num1%10
            num1/=10
        }
        val reade1 = Reader()
        return reade1.transform(arr)
    }

    private fun outputText(sityva:String){
        txt1.text = sityva
    }
}
