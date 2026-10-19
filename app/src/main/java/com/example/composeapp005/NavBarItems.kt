package com.example.composeapp005

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AppShortcut
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Subscript

object NavBarItems {
    val BarItems = listOf(
        BarItem(
            "Главная",
            Icons.Default.Home,
            Routes.HOME
        ),
        BarItem(
            "Настройки",
            Icons.Default.CheckCircleOutline,
            Routes.SETTING
        ),
        BarItem(
            "Профиль",
            Icons.Default.Person,
            Routes.PROFILE
        ),
        BarItem(
            "Шортсы",
            Icons.Default.AppShortcut,
            Routes.SHORTS
        ),
        BarItem(
            "Подписки",
            Icons.Default.Subscript,
            Routes.SUBSCRIBED
        )
    )
}