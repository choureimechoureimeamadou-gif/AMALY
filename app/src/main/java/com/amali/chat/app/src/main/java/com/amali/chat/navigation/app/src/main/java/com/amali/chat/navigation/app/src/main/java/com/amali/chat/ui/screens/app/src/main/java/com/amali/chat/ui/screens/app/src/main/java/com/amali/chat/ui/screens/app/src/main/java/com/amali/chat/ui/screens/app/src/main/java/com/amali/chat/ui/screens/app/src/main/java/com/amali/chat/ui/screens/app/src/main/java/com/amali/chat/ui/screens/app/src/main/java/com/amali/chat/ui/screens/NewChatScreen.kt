package com.amali.chat.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NewChatScreen(
    onBack: () -> Unit,
    onOpenChat: () -> Unit
) {
    var number by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            "Nouveau chat",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = number,
            onValueChange = { number = it },
            label = { Text("Numéro ou utilisateur") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = onOpenChat,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ouvrir la discussion")
        }
    }
}
