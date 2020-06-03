package com.example.quizapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     val b1: Button =findViewById(R.id.start_button)
        b1.setOnClickListener(this)
    }

    override fun onBackPressed() {
        val builder= AlertDialog.Builder(this)
        builder.setMessage("Are you sure you want to exit?")
        builder.setCancelable(true)
        builder.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
            finish()
        }
        builder.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
            dialogInterface.cancel()
        }
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }
    private fun validate(): Boolean{
        val txt: TextView =findViewById(R.id.text1)
        if(txt.text.toString().isEmpty()){
            txt.error="Name cannot be empty"
        return false}
        else{
            return true}

    }
    override  fun onClick(v: View?){
       when(v?.id){R.id.start_button->{
           if(validate()){
               Toast.makeText(this,"Start",Toast.LENGTH_SHORT).show()
               val intent= Intent(this,ques1::class.java)
               startActivity(intent)
           }
       }
       }
    }
}
