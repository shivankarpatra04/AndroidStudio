package com.example.portfolioapp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val LinearLayout = findViewById<LinearLayout>(R.id.mainlayout)
        val animationDrawable = LinearLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(1500)
        animationDrawable.setExitFadeDuration(3000)
        animationDrawable.start()

        val ButtonSkills = findViewById<Button>(R.id.btnSkills)
        ButtonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val ButtonEducation = findViewById<Button>(R.id.btnEducation)
        ButtonEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        val ButtonProject = findViewById<Button>(R.id.btnProject)
        ButtonProject.setOnClickListener {
            intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }
        val ButtonExperience = findViewById<Button>(R.id.btnExperience)
        ButtonExperience.setOnClickListener {
            intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }

    }
}