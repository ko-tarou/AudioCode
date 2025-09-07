package com.example.audiocode

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object Profile
@Serializable
object FriendsList

@Composable
fun NavigationPortal(

){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Profile
    ){
        composable<Profile> { ProfileScreen(
            onNavigateToFriendsList = {
                navController.navigate(
                    route = FriendsList
                )
            }
        ) }
        composable<FriendsList> { FriendsListScreen(
            onNavigateToProfile = {
                navController.navigate(
                    route = Profile
                )
            }
        ) }
    }
}