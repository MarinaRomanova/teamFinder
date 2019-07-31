package com.example.marinar.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.marinar.swoosh.R
import com.example.marinar.swoosh.Utils.EXTRA_LEAGUE
import com.example.marinar.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        searchLeaguesText.text = "Looking for $league $skill near you..."
    }
}
