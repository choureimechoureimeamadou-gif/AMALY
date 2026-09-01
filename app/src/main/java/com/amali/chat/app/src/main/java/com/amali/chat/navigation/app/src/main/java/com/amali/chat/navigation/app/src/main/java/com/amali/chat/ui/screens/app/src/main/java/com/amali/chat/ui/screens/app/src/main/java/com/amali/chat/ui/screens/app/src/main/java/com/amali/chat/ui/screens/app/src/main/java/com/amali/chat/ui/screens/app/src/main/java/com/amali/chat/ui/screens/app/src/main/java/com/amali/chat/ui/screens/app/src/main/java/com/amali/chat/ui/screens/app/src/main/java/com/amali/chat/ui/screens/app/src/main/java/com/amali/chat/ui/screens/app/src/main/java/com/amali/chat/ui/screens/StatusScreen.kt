package com.amali.chat.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StatusScreen(
    onBack: () -> Unit,
    onCreateStatus: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Statuts") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onCreateStatus) {
                Text("+")
            }
        }
    ) { padding ->
        Text(
            "Aucun statut pour le moment.",
            modifier = Modifier.padding(padding)
        )
    }
}
