package com.example.quizapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ques1:AppCompatActivity() {
    lateinit var ans1: RadioGroup
    lateinit var ra11:RadioButton
    lateinit var ra12:RadioButton
    lateinit var ra13:RadioButton
    lateinit var ra14:RadioButton

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.q1)
            ans1= findViewById<RadioGroup>(R.id.ans1)
            ra11= findViewById<RadioButton>(R.id.ra11)
            ra12= findViewById<RadioButton>(R.id.ra12)
            ra13= findViewById<RadioButton>(R.id.ra13)
            ra14= findViewById<RadioButton>(R.id.ra14)
            val b1: Button = findViewById(R.id.qb1)
            b1.setOnClickListener { sub1() }
            val b2: Button = findViewById(R.id.qn1)
            b2.setOnClickListener { nxt1() }
            val b3:Button=findViewById(R.id.f1)
            b3.setOnClickListener { fnsh() }

        }
    private fun fnsh(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("Are you sure!")
        builder.setIcon(R.drawable.ic_action_check)
        builder.setMessage("Do you want to finish  this quiz?")
        builder.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(this,"Finish",Toast.LENGTH_SHORT).show()
            val intent= Intent(this,lst_page::class.java)
            startActivity(intent)
        }
        builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    private fun sub1(){
        var result=""
        if(ra12.isChecked)
        {
            result+="It is correct!"
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Answer")
            builder.setIcon(R.drawable.ic_action_check)
            builder.setMessage(result)
            builder.setPositiveButton("",null)
            val dialog:AlertDialog=builder.create()
            dialog.show()
            val intent= Intent(this,ques2::class.java)
            startActivity(intent)
        }
        else{
            result+="It is not correct"
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Answer")
            builder.setIcon(R.drawable.ic_action_check2)
            builder.setMessage(result)
            builder.setPositiveButton("OK",null)
            val dialog:AlertDialog=builder.create()
            dialog.show()
        }


        Toast.makeText(this,"Submit", Toast.LENGTH_SHORT).show()

    }
    private fun nxt1(){
        Toast.makeText(this,"Next Question",Toast.LENGTH_SHORT).show()
        val intent= Intent(this,ques2::class.java)
        startActivity(intent)
    }
    }