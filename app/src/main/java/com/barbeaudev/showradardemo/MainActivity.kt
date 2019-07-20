package com.barbeaudev.showradardemo

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        no_altitude.setOnClickListener{ view ->
            val intent = Intent("com.google.android.radar.SHOW_RADAR")
            intent.putExtra("latitude", 28.0627222f)
            intent.putExtra("longitude", -82.5331001f)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
        with_altitude.setOnClickListener{ view ->
            val intent = Intent("com.google.android.radar.SHOW_RADAR")
            intent.putExtra("latitude", 28.0527888f)
            intent.putExtra("longitude", -82.4331008f)
            intent.putExtra("altitude", 20.3f)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
        bad_latitude.setOnClickListener{ view ->
            val intent = Intent("com.google.android.radar.SHOW_RADAR")
            intent.putExtra("latitude", 283.0927888f)
            intent.putExtra("longitude", -82.1331008f)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
        double_values.setOnClickListener{ view ->
            val intent = Intent("com.google.android.radar.SHOW_RADAR")
            intent.putExtra("latitude", 28.2537888)
            intent.putExtra("longitude", -82.1331008)
            intent.putExtra("altitude", 20.3)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
