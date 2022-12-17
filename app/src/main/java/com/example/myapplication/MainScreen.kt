package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.ui.theme.Shapes

@Composable
fun MainScreen(navController: NavController){
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
        Image(
            painter = painterResource(id = R.drawable.pinterestlogo),
            modifier = Modifier.size(250.dp),
            contentDescription = "")
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedButton(
            onClick = {
                navController.navigate("login"){
                    popUpTo("mainscreen")
                }
            },
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(60.dp)
                .shadow(elevation = 3.dp, shape = RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.outlinedButtonColors(Color.White),

        )
        {
            Text(text = "Login", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        }
        Spacer(modifier = Modifier.size(10.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(60.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.dp, color = Color.White),
            shape = RoundedCornerShape(15.dp)

            )
        {
            Text(text = "Sign Up", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
        }


    }



}