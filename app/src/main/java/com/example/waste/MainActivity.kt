package com.example.waste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.waste.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }

        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavigationView.apply {
            background = null
            menu.getItem(1).isEnabled = false
            setupWithNavController(navController)
        }

        binding.fab.setOnClickListener {
            println("CLICKED")
            
            CustomBottomSheetDialogFragment().show(supportFragmentManager, CustomBottomSheetDialogFragment.TAG)
        }
    }
}