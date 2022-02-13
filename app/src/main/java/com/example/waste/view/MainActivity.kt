package com.example.waste.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.waste.R
import com.example.waste.ShoppingListView
import com.example.waste.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root)

        binding.composeView.setContent {  Text("IS it worked",
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)) }
        //TODO: ???????????????
        }

        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavigationView.apply {
            background = null
            menu.getItem(1).isEnabled = false
            setupWithNavController(navController)
        }

        binding.fab.setOnClickListener {
            println("CLICKED")
            
            //CustomBottomSheetDialogFragment().show(supportFragmentManager, CustomBottomSheetDialogFragment.TAG)
        }
    }
}