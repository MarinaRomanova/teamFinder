package com.example.marinar.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.marinar.swoosh.Model.Player
import com.example.marinar.swoosh.R
import com.example.marinar.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} near you..."
    }
}
