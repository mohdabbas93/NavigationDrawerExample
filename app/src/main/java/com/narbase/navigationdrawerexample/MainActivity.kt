package com.narbase.navigationdrawerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationDrawer.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.appleItem -> navigationDrawerItemText.text = menuItem.title
                R.id.orangeItem -> navigationDrawerItemText.text = menuItem.title
                R.id.bananaItem -> navigationDrawerItemText.text = menuItem.title
            }

            drawerLayout.closeDrawers()

            true
        }
    }
}
