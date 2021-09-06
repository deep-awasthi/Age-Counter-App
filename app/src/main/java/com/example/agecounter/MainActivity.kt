package com.example.agecounter


import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Date
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {view ->
            clickDatePicker(view)
            Toast.makeText(this, "Button Works", Toast.LENGTH_LONG).show()
        }
    }

fun clickDatePicker(view: View?) {

    val myCalender = Calendar.getInstance();
    val year = myCalender.get(Calendar.YEAR);
    val month = myCalender.get(Calendar.MONTH);
    val day = myCalender.get(Calendar.DAY_OF_MONTH);

    DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

        val selectedDate = "$dayOfMonth/${month+1}/$year"

        val theDate = sdf.parse(selectedDate)

        textView6.setText(selectedDate)

        


    }
        , year, month, day).show()
    }
}