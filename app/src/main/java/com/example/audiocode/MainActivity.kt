package com.example.audiocode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.audiocode.ui.theme.AudioCodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AudioCodeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavigationPortal()
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    onNavigateToFriendsList: () -> Unit,
){
    Button(
        onClick = { onNavigateToFriendsList() },
        modifier = modifier,
    ) {
        Text("profile")
    }
}

@Composable
fun FriendsListScreen(
    modifier: Modifier = Modifier,
    onNavigateToProfile: () -> Unit,
){
    Button(
        onClick = { onNavigateToProfile() },
        modifier = modifier,
    ) {
        Text("FriendsList")
    }
}