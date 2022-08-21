package com.example.basketball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var s1 = 0
    var s2 = 0
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)


                val t1b1 = findViewById<Button>(R.id.t1oneP)
                val t1b2 = findViewById<Button>(R.id.t1twoP)
                val t1b3 = findViewById<Button>(R.id.t1threeP)
                val t2b1 = findViewById<Button>(R.id.t2oneP)
                val t2b2 = findViewById<Button>(R.id.t2twoP)
                val t2b3 = findViewById<Button>(R.id.t2threeP)

                t1b1.setOnClickListener(this)
                t1b2.setOnClickListener(this)
                t1b3.setOnClickListener(this)
                t2b1.setOnClickListener(this)
                t2b2.setOnClickListener(this)
                t2b3.setOnClickListener(this)

            }
            override fun onClick(v: View?) {

                when (v?.id) {
                    R.id.t1oneP -> s1++
                    R.id.t1twoP -> s1 += 2
                    R.id.t1threeP -> s1 += 3
                    R.id.t2oneP -> s2++
                    R.id.t2twoP -> s2 += 2
                    R.id.t2threeP -> s2 += 3
                }
                findViewById<TextView>(R.id.t1Score).text = s1.toString()
                findViewById<TextView>(R.id.t2Score).text = s2.toString()
            }
}