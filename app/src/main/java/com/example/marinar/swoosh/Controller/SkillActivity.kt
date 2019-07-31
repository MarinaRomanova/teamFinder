package com.example.marinar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.marinar.swoosh.R
import com.example.marinar.swoosh.Utils.EXTRA_LEAGUE
import com.example.marinar.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skillSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onFinishClicked(view: View) {
        if (ballerBtn.isChecked || beginnerBtn.isChecked) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skillSelected)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, getString(R.string.select_skill_toast), Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClicked(view: View) {
        ballerBtn.isChecked = false
        skillSelected = getString(R.string.beginner)
    }

    fun onBallerClicked(view: View) {
        beginnerBtn.isChecked = false
        skillSelected = getString(R.string.baller)
    }
}
