package com.amali.chat.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onChat: () -> Unit,
    onContacts: () -> Unit,
    onGroups: () -> Unit,
    onStatus: () -> Unit,
    onCalls: () -> Unit,
    onProfile: () -> Unit,
    onSettings: () -> Unit,
    onNewChat: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("AMALI") },
                actions = {
                    TextButton(onClick = onProfile) {
                        Text("Profil")
                    }
                    TextButton(onClick = onSettings) {
                        Text("⚙")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onNewChat) {
                Text("+")
            }
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            Button(
                onClick = onChat,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("💬 Discussions")
            }

            Button(
                onClick = onContacts,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("👥 Contacts")
            }

            Button(
                onClick = onGroups,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("👨‍👩‍👧‍👦 Groupes")
            }

            Button(
                onClick = onStatus,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("⭕ Statuts")
            }

            Button(
                onClick = onCalls,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("📞 Appels")
            }
        }
    }
}
