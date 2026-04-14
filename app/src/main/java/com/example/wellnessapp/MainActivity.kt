package com.example.wellnessapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        Find the buttons by use of their ids
        val HealthButton = findViewById<Button>(R.id.Health_recipes)
        val NutritionButton = findViewById<Button>(R.id.Nutrition_advice)
        val MeditationButton = findViewById<Button>(R.id.Medication)
        val HydrationButton = findViewById<Button>(R.id.Hydration_Alert)
        val ExerciseButton = findViewById<Button>(R.id.Start_Exercise)
        val MotivationButton = findViewById<Button>(R.id.Daily_Motivation)
        val WeeklygoalButton = findViewById<Button>(R.id.Weekly_Goals)
        val LearnMoreButton = findViewById<Button>(R.id.learnmore)


//        set onclick listener to the buttons as you do the intent to the different pages
        HealthButton.setOnClickListener {
            val intent = Intent(applicationContext, Healthactivity::class.java)
            startActivity(intent)

        }

        NutritionButton.setOnClickListener {
            val intent = Intent(applicationContext, Nutritionactivity::class.java)
            startActivity(intent)

        }
        MeditationButton.setOnClickListener {
            val intent = Intent(applicationContext, Meditationactivity::class.java)
            startActivity(intent)

        }
        HydrationButton.setOnClickListener {
            val intent = Intent(applicationContext, Hydrationactivity::class.java)
            startActivity(intent)

        }
        ExerciseButton.setOnClickListener {
            val intent = Intent(applicationContext, Exerciseactivity::class.java)
            startActivity(intent)

        }
        MotivationButton.setOnClickListener {
            val intent = Intent(applicationContext, Motivationactivity::class.java)
            startActivity(intent)

        }
        WeeklygoalButton.setOnClickListener {
            val intent = Intent(applicationContext, Weeklygoalsactivity::class.java)
            startActivity(intent)

        }

//        below is an implicit intent.When the button learn more is clicked, it takes us to the default browser
        LearnMoreButton.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.healthline.com/health/how-to-maintain-a-healthy-lifestyle")
            )
            startActivity(intent)

        }
    }
}