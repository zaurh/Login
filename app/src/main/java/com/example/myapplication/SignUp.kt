package com.example.myapplication

import android.text.style.UnderlineSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SignUp(navController: NavController){
    var passwordVisible by remember { mutableStateOf(false) }
    var passwordconfirmVisible by remember { mutableStateOf(false) }

    val emailtf = remember { mutableStateOf("") }
    val passwordtf = remember { mutableStateOf("") }
    val passwordconfirmtf = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        colorResource(id = R.color.gradientTop),
                        colorResource(id = R.color.gradientBottom)
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Create Account", fontSize = 30.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
        Text(text = "to get started now!", fontSize = 30.sp, color = Color.White)
        Spacer(modifier = Modifier.size(30.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.85f),
            value = emailtf.value,
            onValueChange = {emailtf.value = it},
            label = { Text(text = "Email Address", color = Color.White, modifier = Modifier.padding(0.dp, 5.dp, 0.dp, 25.dp))},
            shape = RoundedCornerShape(15.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                backgroundColor = colorResource(id = R.color.outlinedTextField),
                textColor = Color.White
            )


        )
        Spacer(modifier = Modifier.size(10.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.85f),
            value = passwordtf.value,
            onValueChange = {passwordtf.value = it},
            label = { Text(text = "Password", color = Color.White, modifier = Modifier.padding(0.dp, 5.dp, 0.dp, 25.dp))},
            shape = RoundedCornerShape(15.dp),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                if (passwordVisible)
                    Icon(painter = painterResource(id = R.drawable.password_eye_hidden), contentDescription = "", tint = Color.White)
                else Icon(painter = painterResource(id = R.drawable.password_eye), contentDescription = "")

                IconButton(onClick = {passwordVisible = !passwordVisible}){
                    Icon(painter = painterResource(id = R.drawable.password_eye), contentDescription = "", tint = Color.White)
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                backgroundColor = colorResource(id = R.color.outlinedTextField),
                textColor = Color.White
            )


        )
        Spacer(modifier = Modifier.size(10.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.85f),
            value = passwordconfirmtf.value,
            onValueChange = {passwordconfirmtf.value = it},
            label = { Text(text = "Confirm Password", color = Color.White, modifier = Modifier.padding(0.dp, 5.dp, 0.dp, 25.dp))},
            shape = RoundedCornerShape(15.dp),
            visualTransformation = if (passwordconfirmVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                if (passwordconfirmVisible)
                    Icon(painter = painterResource(id = R.drawable.password_eye_hidden), contentDescription = "", tint = Color.White)
                else Icon(painter = painterResource(id = R.drawable.password_eye), contentDescription = "")

                IconButton(onClick = {passwordconfirmVisible = !passwordconfirmVisible}){
                    Icon(painter = painterResource(id = R.drawable.password_eye), contentDescription = "", tint = Color.White)
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                backgroundColor = colorResource(id = R.color.outlinedTextField),
                textColor = Color.White
            )


        )
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(60.dp)
                .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.outlinedButtonColors(Color.White),

            )
        {
            Text(text = "Sign Up", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        }

        Spacer(modifier = Modifier.size(80.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(30.dp), horizontalArrangement = Arrangement.Center)
        {
            Text(text = "─────────", color = Color.White)
            Spacer(modifier = Modifier.size(15.dp))
            Text(text = "Or Sign Up with", color = Color.White)
            Spacer(modifier = Modifier.size(15.dp))
            Text(text = "─────────", color = Color.White)
        }
        Spacer(modifier = Modifier.size(20.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp), horizontalArrangement = Arrangement.Center)
        {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(150.dp, 50.dp)
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp)),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "",
                    modifier = Modifier.size(50.dp)
                )
            }
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedButton(onClick = { /*TODO*/ }, modifier = Modifier
                .size(150.dp, 50.dp)
                .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp))) {
                Image(
                    painter = painterResource(id = R.drawable.facebook_logo),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
        Spacer(modifier = Modifier.size(40.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Already have an account?", color = Color.White)
            Spacer(modifier = Modifier.size(5.dp))
            Text(modifier = Modifier.clickable {
                navController.navigate("login"){
                    popUpTo("signup"){inclusive = true}
                }
            },
                text = "Login Now",
                color = Color.White,
                textDecoration = TextDecoration.Underline
            )
        }
    }

}