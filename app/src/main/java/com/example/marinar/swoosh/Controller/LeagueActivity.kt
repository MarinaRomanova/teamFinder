package com.example.marinar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.marinar.swoosh.R
import com.example.marinar.swoosh.Utils.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womens.isChecked = false;
        co_ed.isChecked = false;

        selectedLeague = getString(R.string.mens)
    }

    fun onWomensClicked(view: View) {
        mens.isChecked = false;
        co_ed.isChecked = false;

        selectedLeague = getString(R.string.womens)
    }

    fun onCoEdClicked(view: View) {
        womens.isChecked = false;
        mens.isChecked = false;

        selectedLeague = getString(R.string.co_ed)

    }

    fun leagueNextClicked(view: View) {

        if (mens.isChecked || womens.isChecked || co_ed.isChecked) {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, getString(R.string.select_league_toast), Toast.LENGTH_SHORT).show()
        }
    }
}
