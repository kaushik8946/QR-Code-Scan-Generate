package com.kaushik.qr_code

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Generator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var inputText by rememberSaveable {
                mutableStateOf("")
            }
            val img by rememberSaveable {
                mutableStateOf(Bitmap.createBitmap(150, 150, Bitmap.Config.ARGB_8888))
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedTextField(
                    value = inputText,
                    onValueChange = { inputText = it },
                    label = {
                        Text(text = "Enter text:")
                    },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.height(50.dp)
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Generate",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}