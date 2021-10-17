package com.example.recyclerview_veronika_32_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerview_veronika_32_.Game as Game1

class DetailGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_game)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val game = intent.getParcelableExtra<Game1>(MainActivity.INTENT_PARCELABLE)

        val imgGame = findViewById<ImageView>(R.id.img_item_photo)
        val nameGame = findViewById<TextView>(R.id.tv_item_name)
        val descGame = findViewById<TextView>(R.id.tv_item_description)

        imgGame.setImageResource(game?.imgGame!!)
        nameGame.text = game.nameGame
        descGame.text = game.descGame
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}