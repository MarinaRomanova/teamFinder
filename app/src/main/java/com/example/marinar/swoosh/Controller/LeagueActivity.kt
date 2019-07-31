package com.example.marinar.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.marinar.swoosh.Model.Player
import com.example.marinar.swoosh.R
import com.example.marinar.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womens.isChecked = false;
        co_ed.isChecked = false;

        player.league = getString(R.string.mens)
    }

    fun onWomensClicked(view: View) {
        mens.isChecked = false;
        co_ed.isChecked = false;

        player.league = getString(R.string.womens)
    }

    fun onCoEdClicked(view: View) {
        womens.isChecked = false;
        mens.isChecked = false;
        player.league = getString(R.string.co_ed)

    }

    fun leagueNextClicked(view: View) {

        if (mens.isChecked || womens.isChecked || co_ed.isChecked) {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, getString(R.string.select_league_toast), Toast.LENGTH_SHORT).show()
        }
    }
}
