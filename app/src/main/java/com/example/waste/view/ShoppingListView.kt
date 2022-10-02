package com.example.waste.view

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView

class ShoppingListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
): AbstractComposeView(context, attrs, defStyle){

    @Composable
    override fun Content() {
        testText()
    }

    @Composable
    fun testText() {
        Text("IS it worked",
            modifier = Modifier
                .wrapContentSize()
                .background(Color.Cyan))
    }
}