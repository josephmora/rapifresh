package com.example.example.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.example.R
import com.example.example.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding:ActivityHomeBinding
    //creo un appBarConfigurations
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val navController = findNavController(R.id.nav_host_fragment_content_home)
        //defino el setOf para que los fragmentos tengan la misma jerarquia y no aparezca la flecha en el toolBar
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.homeFragment,
            R.id.productFragment,
            R.id.commentFragment,
            R.id.profileFragment
        ))
        setupActionBarWithNavController(navController,appBarConfiguration)
        binding.bottonNavigation.setupWithNavController(navController)
    }


    //permite que aparezca la flecha de arriba para navegar

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_home)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}