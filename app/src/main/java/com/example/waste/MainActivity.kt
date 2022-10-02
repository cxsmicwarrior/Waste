package com.example.waste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.waste.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root)


//            //val composeView = binding.composeView
//            val composeView = findViewById<ComposeView>(R.id.compose_view)
//
//            composeView.setContent {
//                Text(
//                    text = "Hello I am from Compose",
//                    modifier = Modifier.fillMaxSize()
//                )
//            }
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