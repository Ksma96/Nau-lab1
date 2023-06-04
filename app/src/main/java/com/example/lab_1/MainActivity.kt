package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnAnimalClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onClick(animal: Animal) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(DetailsActivity.ANIMAL_KEY, animal)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = listOf(
            Animal(
                name = "Koala",
                slogan = "Cute Australian marsupial",
                longDescription = "The koala is a cute and iconic marsupial native to Australia. They are known for their fluffy appearance, round faces, and large, fuzzy ears. Koalas primarily feed on eucalyptus leaves and spend most of their time in trees. They have a slow metabolism and sleep for up to 20 hours a day. Koalas are gentle and docile creatures, often seen clinging to tree branches.",
                smallImageRes = R.drawable.koala_small,
                bigImageRes = R.drawable.coala_big
            ),
            Animal(
                name = "Octopus",
                slogan = "Intelligent marine creature",
                longDescription = "The octopus is an intelligent and highly adaptable marine creature. They have soft bodies, bulbous heads, and long tentacles with suction cups. Octopuses are known for their remarkable problem-solving skills and ability to camouflage with their surroundings. They are carnivorous and feed on a variety of prey, including fish, crabs, and mollusks.",
                smallImageRes = R.drawable.octopus_small,
                bigImageRes = R.drawable.octopus_big
            ),
            Animal(
                name = "Red Panda",
                slogan = "Adorable arboreal mammal",
                longDescription = "The red panda is an adorable and arboreal mammal native to the eastern Himalayas and southwestern China. They are known for their vibrant reddish-brown fur, bushy tails, and masked faces. Red pandas primarily feed on bamboo, but they also consume fruits, insects, and small animals. They are solitary animals and are skilled climbers, spending most of their time in trees.",
                smallImageRes = R.drawable.red_panda_small,
                bigImageRes = R.drawable.red_panda_small
            )
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = AnimalAdapter(animalList, this)
    }
}