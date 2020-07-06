package jp.techacademy.taiyu.aisatuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
       if (v.id == R.id.button1){
           showTimePickerDIalog()
       }
    }

    private fun showTimePickerDIalog(){
                        val timePickerDialog = TimePickerDialog(
                            this,
                            TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                               if ( hour  >= 2 && hour <= 9 && minute <= 59){
                                   textView.text = "おはよう"
                               } else if (hour  >= 10 && hour <= 17 && minute <= 59){
                                   textView.text = "こんにちは"
                               }else if (hour >= 18 && hour <= 25 && minute <= 59) {
                                textView.text = "こんばんは"
                            }else{
                                   textView.text = "こんばんは"
                               }
                            },
                            9, 0, true)
                        timePickerDialog.show()
                    }
                }
