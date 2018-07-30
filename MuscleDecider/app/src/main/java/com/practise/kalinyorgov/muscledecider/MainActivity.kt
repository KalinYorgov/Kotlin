package com.practise.kalinyorgov.muscledecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val musclesList = arrayListOf("Arms", "Legs", "Shoulders")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomMuscle = random.nextInt(musclesList.count())
            selectedMuscleGrp.text = musclesList[randomMuscle]
        }

        addMuscleBtn.setOnClickListener {
            val newMuscle = addMuscleTxt.text.toString()
            musclesList.add(newMuscle)
            addMuscleTxt.text.clear()
            println(musclesList)
        }
    }
}
