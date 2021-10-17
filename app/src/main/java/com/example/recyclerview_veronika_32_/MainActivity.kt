package com.example.recyclerview_veronika_32_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameList = listOf<Game>(
            Game(
                R.drawable.cod,
                nameGame = "Call of Duty",
                descGame = "Call of Duty atau yang sering disingkat sebagai CoD adalah permainan perang tembak - menembak orang pertama yang dikembangkan oleh Infinity Ward dan dipublikasikan oleh Activision pada tanggal 29 Oktober 2003 untuk PC."
            ),
            Game(
                R.drawable.gi,
                nameGame = "Genshin Impact",
                descGame = "Genshin Impact adalah oermainan free-tp-play action RPG dunia terbuka yang dikembangkan oleh miHoYo. Game ini dirilis pada tanggal 28 September 2020 di platform Android, iOS, Windows, dan Playstation4, serta 28 April 2021 di Platform PlayStation 5."
            ),
            Game(
                R.drawable.minecraft,
                nameGame = "Minecraft",
                descGame = "Minecraft adalah permainan sandbox 3D yang tidak memiliki tujuan khusus dan tujuan yang jelas untuk dicapai, memungkinkan pemain memiliki kebebasan untuk memilih cara bermain."
            ),
            Game(
                R.drawable.ml,
                nameGame = "Mobile Legends: Bang Bang",
                descGame = "Mobile Legends: Bang Bang atau ML merupakan game MOBA yang dirilis oleh Moontoon. Game ini bisa dimainkan di ponsel Android maupun IOS. Dalam game MOBA ini akan ada 10 pemain yang akan dibagi menjadi 2 tim. Aturan mainnya yakni 5 vs 5."
            ),
            Game(
                R.drawable.pubg,
                nameGame = "PUBG",
                descGame = "PlayerUnknown's Battlegrounds (sering disingkat PUBG) adalah sebuah permainan video dengan genre battle royale, di mana 100 orang sekaligus dapat bermain secara daring."
            ),
            Game(
                R.drawable.roblox,
                nameGame = "Roblox",
                descGame = "Roblox adalah platform permainan daring dan sistem pembuatan permainan yang memungkinkan pengguna memprogram permainan dan memainkan permainan yang dibuat oleh pengguna lain."
            ),
            Game(
                R.drawable.valo,
                nameGame = "Valorant",
                descGame = "Valorant (bergaya sebagai VALORANT) adalah penembak pahlawan orang pertama taktis multipemain gratis untuk dimainkan yang dikembangkan dan diterbitkan oleh Riot Games, untuk Microsoft Windows."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_game)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize((true))
        recyclerView.adapter = GameAdapter(this, gameList){
            val intent = Intent (this, DetailGameActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}