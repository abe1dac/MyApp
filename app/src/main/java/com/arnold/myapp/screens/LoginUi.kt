package com.arnold.myapp.screens

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arnold.myapp.Greeting
import com.arnold.myapp.R
import com.arnold.myapp.ui.theme.MyappTheme

@Composable
fun LoginUi(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

   // Column(modifier =Modifier) {
      //  Image(painter = painterResource(id = R.drawable.ajira), contentDescription = "welcome to kenya")
   // }

    Column (modifier= Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
             horizontalAlignment = Alignment.CenterHorizontally,)
    {
               Image(painter = painterResource(id = R.drawable.ajira),
                   contentDescription = "welcome to kenya")
        Spacer(modifier=Modifier. height(8.dp))
        Text(text = "WELCOME BACK LOGIN ")
               Spacer(modifier=Modifier. height(8.dp))
      OutlinedTextField(value = email ,
           onValueChange= {email= it},
          label = { Text(text = "Email:") }
)
               Spacer(modifier=Modifier. height(8.dp))
               OutlinedTextField(value = password,
                   onValueChange = {password=it},
                   label = { Text(text = "Password") },
                   visualTransformation = PasswordVisualTransformation()
               )
          Button(onClick = {}) {
              Text(text = "Login")
          }
               Spacer(modifier=Modifier. height(8.dp))
               TextButton(onClick = {}) {
                   Text(text = "Don't have account signup ", modifier= Modifier.clickable {  })
               }
           }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyappTheme {
        LoginUi()
    }
}