package com.example.neervyas.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View){

        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedleague ="men"

    }

    fun onWomenClicked(view: View){

        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedleague = "women"

    }

    fun onCoedClicked(view: View){

        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        selectedleague = "co-ed"

    }

    fun leagueNextClicked(view: View) {



        if (selectedleague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedleague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }




}
