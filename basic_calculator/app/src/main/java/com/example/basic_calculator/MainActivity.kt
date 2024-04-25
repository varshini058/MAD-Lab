package com.example.basic_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IdRes
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val ip1:EditText=findViewById(R.id.n1)
        val ip2:EditText=findViewById(R.id.n2)
        val add:Button=findViewById(R.id.add)
        val sub:Button=findViewById(R.id.sub)
        val mul:Button=findViewById(R.id.mul)
        val div:Button=findViewById(R.id.div)
        val restext:EditText=findViewById((R.id.res))

        add.setOnClickListener {
            val ip1 = ip1.text.toString().toDoubleOrNull()
            val ip2 = ip2.text.toString().toDoubleOrNull()
            if ((ip1 != null) and (ip2 != null)) {
                val result = ip1?.plus(ip2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } //else {
               // restext.text = "Please "
            //}
        }

        sub.setOnClickListener {
            val ip1 = ip1.text.toString().toDoubleOrNull()
            val ip2 = ip2.text.toString().toDoubleOrNull()
            if ((ip1 != null) and (ip2 != null)) {
                val result = ip1?.minus(ip2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } //else {
              //  restext.text = "Please enter a valid value"
            //}
        }

        mul.setOnClickListener {
            val ip1 = ip1.text.toString().toDoubleOrNull()
            val ip2 = ip2.text.toString().toDoubleOrNull()
            if ((ip1 != null) and (ip2 != null)) {
                val result = ip1?.times(ip2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } //else {
               // restext.text = "Please enter a valid value"
            //}
        }

        div.setOnClickListener {
            val ip1 = ip1.text.toString().toDoubleOrNull()
            val ip2 = ip2.text.toString().toDoubleOrNull()
            if ((ip1 != null) and (ip2 != null)) {
                val result = ip1?.div(ip2!!)
                val res= round(result!! * 100) /100
                val a =res.toString()
                restext.setText(a)
            } //else {
              //  restext.text = "Please enter a valid value"
           // }
        }




    }
}



