package com.amali.chat.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    onPrivacy: () -> Unit,
    onSecurity: () -> Unit,
    onNotifications: () -> Unit,
    onAppearance: () -> Unit,
    onStorage: () -> Unit,
    onAI: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            "Paramètres",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(20.dp))

        Text("Confidentialité", Modifier.clickable { onPrivacy() }.padding(16.dp))
        Text("Sécurité", Modifier.clickable { onSecurity() }.padding(16.dp))
        Text("Notifications", Modifier.clickable { onNotifications() }.padding(16.dp))
        Text("Apparence", Modifier.clickable { onAppearance() }.padding(16.dp))
        Text("Stockage", Modifier.clickable { onStorage() }.padding(16.dp))
        Text("AMALI IA", Modifier.clickable { onAI() }.padding(16.dp))
    }
}
