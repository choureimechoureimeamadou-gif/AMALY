package com.amali.chat.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GroupsScreen(
    onBack: () -> Unit,
    onCreateGroup: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Groupes") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onCreateGroup) {
                Text("+")
            }
        }
    ) { padding ->
        Text(
            "Vos groupes apparaîtront ici.",
            modifier = Modifier.padding(padding)
        )
    }
}
