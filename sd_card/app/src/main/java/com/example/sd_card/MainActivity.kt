package com.example.sd_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val register: EditText =this.findViewById(R.id.regno)
    val name:EditText=this.findViewById(R.id.name)
    val cgpa:EditText=this.findViewById(R.id.cgpa)
    val save: Button =this.findViewById(R.id.savebutton)
    val load:Button= this.findViewById(R.id.loadbutton)

    val enter_name=name.text.toString()
    val enter_no=register.text.toString()
    val enter_cgpa=cgpa.text.toString()

    save.setOnClickListener {
        val file=File(getExternalFilesDir(null),"student.txt")
        val fos= FileOutputStream(file)
        fos.write(("$enter_no, $enter_cgpa, $enter_cgpa".toByteArray()))

        name.text.clear()
        register.text.clear()
        cgpa.text.clear()

        fos.close()
    }
    load.setOnClickListener {
        val file= File(getExternalFilesDir(null),"student.txt")
        val fis= FileInputStream(file)
        val isr= InputStreamReader(fis)
        val br= BufferedReader(isr)
        val line=br.readLine()
        var parts=line.split(",")
        register.setText(parts[0])
        name.setText(parts[1])
        cgpa.setText(parts[2])
        fis.close()

    }
}
}

