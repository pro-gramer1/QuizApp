package com.example.quizapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.q5.*


class ques5: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.q5)
        val b1: Button = findViewById(R.id.qb5)
        b1.setOnClickListener { sub1() }
        val b3:Button=findViewById(R.id.f5)
        b3.setOnClickListener{fnsh()}
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
        if(ra53.isChecked)
        {
            result+="It is correct!"
            val builder= AlertDialog.Builder(this)
            builder.setTitle("Answer")
            builder.setIcon(R.drawable.ic_action_check)
            builder.setMessage(result)
            builder.setPositiveButton("OK",null)
            val dialog: AlertDialog =builder.create()
            dialog.show()
        }
        else{
            result+="It is not correct"
            val builder= AlertDialog.Builder(this)
            builder.setTitle("Answer")
            builder.setIcon(R.drawable.ic_action_check2)
            builder.setMessage(result)
            builder.setPositiveButton("OK",null)
            val dialog: AlertDialog =builder.create()
            dialog.show()
        }
        Toast.makeText(this,"Submit", Toast.LENGTH_SHORT).show()

    }
  }