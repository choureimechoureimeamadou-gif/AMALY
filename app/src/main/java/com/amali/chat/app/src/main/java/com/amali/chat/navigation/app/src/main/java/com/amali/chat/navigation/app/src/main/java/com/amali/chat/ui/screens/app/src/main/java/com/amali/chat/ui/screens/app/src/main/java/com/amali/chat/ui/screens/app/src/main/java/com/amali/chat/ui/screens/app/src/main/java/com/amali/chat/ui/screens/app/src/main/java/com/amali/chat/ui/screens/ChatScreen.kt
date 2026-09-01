package com.amali.chat.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ChatScreen(
    onBack: () -> Unit
) {
    var message by remember { mutableStateOf("") }

    val messages = remember {
        mutableStateListOf(
            "Bonjour 👋",
            "Bienvenue sur AMALI"
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Discussion") },
                navigationIcon = {
                    TextButton(onClick = onBack) {
                        Text("←")
                    }
                }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {

            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                items(messages) { item ->
                    Text(
                        item,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                OutlinedTextField(
                    value = message,
                    onValueChange = { message = it },
                    modifier = Modifier.weight(1f),
                    placeholder = {
                        Text("Écrire un message")
                    }
                )

                Button(
                    onClick = {
                        if (message.isNotBlank()) {
                            messages.add(message)
                            message = ""
                        }
                    }
                ) {
                    Text("Envoyer")
                }
            }
        }
    }
}
