package com.example.tjapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF9F4EE))
    ) {
        TopNavigationBar()
        Divider(color = Color.Black, thickness = 1.dp)
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            ChatItem(name = "Emma Nielsen", imageResId = R.drawable.jeans)
            ChatItem(name = "Sahra Andersen", imageResId = R.drawable.tshirt)
            ChatItem(name = "Lunder Petersen", imageResId = R.drawable.sweatshirt)
            ChatItem(name = "Mono Laurtisen", imageResId = R.drawable.heels)
            ChatItem(name = "Rasmus Rasmussen", imageResId = R.drawable.glasses)
        }
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}

@Composable
fun TopNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Messages", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Text(text = "Notifikationer", fontSize = 20.sp, color = Color.Gray)
    }
}

@Composable
fun ChatItem(name: String, imageResId: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .shadow(4.dp, RoundedCornerShape(12.dp)),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "test", fontSize = 14.sp, color = Color.Gray)
            }
            Text(text = "Time", fontSize = 14.sp, color = Color.Gray)
        }
    }
}
@Composable
fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Filled.Home, contentDescription = "Home")
        Icon(Icons.Filled.Search, contentDescription = "Search")

        Image(
            painter = painterResource(id = R.drawable.uploadlogo),
            contentDescription = "Upload",
            modifier = Modifier.size(60.dp)
        )
        Icon(Icons.Filled.Email, contentDescription = "Inbox")
        Icon(Icons.Filled.Person, contentDescription = "Account")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen() {
    MainScreen()
}
