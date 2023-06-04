package com.example.lab_1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {

    companion object {
        const val ANIMAL_KEY = "ANIMAL_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val animal = intent.getSerializableExtra(ANIMAL_KEY) as Animal
        findViewById<ImageView>(R.id.imageView).setImageResource(animal.bigImageRes)
        findViewById<TextView>(R.id.nameTextView).text = animal.name
        findViewById<TextView>(R.id.sloganTextView).text = animal.slogan
        findViewById<TextView>(R.id.descriptionTextView).text = animal.longDescription

    }
}