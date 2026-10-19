package com.example.composeapp005

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME,
        modifier = modifier
    ) {
        composable(Routes.HOME) {
            HomeScreen()
        }
        composable(Routes.PROFILE) {
            ProfileScreen()
        }
        composable(Routes.SHORTS) {
            ShortsScreen()
        }
        composable(Routes.SETTING) {
            SettingScreen()
        }
        composable(Routes.SUBSCRIBED) {
            SubscribedScreen()
        }
    }
}