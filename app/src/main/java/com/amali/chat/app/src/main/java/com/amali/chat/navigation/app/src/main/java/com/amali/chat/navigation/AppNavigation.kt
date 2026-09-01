package com.amali.chat.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.amali.chat.ui.screens.*

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.WELCOME
    ) {

        composable(Routes.WELCOME) {
            WelcomeScreen {
                navController.navigate(Routes.PHONE)
            }
        }

        composable(Routes.PHONE) {
            PhoneNumberScreen {
                navController.navigate(Routes.VERIFICATION)
            }
        }

        composable(Routes.VERIFICATION) {
            VerificationScreen {
                navController.navigate(Routes.PROFILE_SETUP)
            }
        }

        composable(Routes.PROFILE_SETUP) {
            ProfileSetupScreen {
                navController.navigate(Routes.HOME) {
                    popUpTo(Routes.WELCOME) {
                        inclusive = true
                    }
                }
            }
        }

        composable(Routes.HOME) {
            HomeScreen(
                onChat = { navController.navigate(Routes.CHAT) },
                onContacts = { navController.navigate(Routes.CONTACTS) },
                onGroups = { navController.navigate(Routes.GROUPS) },
                onStatus = { navController.navigate(Routes.STATUS) },
                onCalls = { navController.navigate(Routes.CALLS) },
                onProfile = { navController.navigate(Routes.PROFILE) },
                onSettings = { navController.navigate(Routes.SETTINGS) },
                onNewChat = { navController.navigate(Routes.NEW_CHAT) }
            )
        }

        composable(Routes.CHAT) {
            ChatScreen {
                navController.popBackStack()
            }
        }

        composable(Routes.CONTACTS) {
            ContactsScreen(
                onBack = { navController.popBackStack() },
                onOpenChat = { navController.navigate(Routes.CHAT) }
            )
        }

        composable(Routes.NEW_CHAT) {
            NewChatScreen(
                onBack = { navController.popBackStack() },
                onOpenChat = { navController.navigate(Routes.CHAT) }
            )
        }

        composable(Routes.GROUPS) {
            GroupsScreen(
                onBack = { navController.popBackStack() },
                onCreateGroup = {
                    navController.navigate(Routes.CREATE_GROUP)
                }
            )
        }

        composable(Routes.CREATE_GROUP) {
            CreateGroupScreen(
                onBack = { navController.popBackStack() },
                onCreated = { navController.popBackStack() }
            )
        }

        composable(Routes.STATUS) {
            StatusScreen(
                onBack = { navController.popBackStack() },
                onCreateStatus = {
                    navController.navigate(Routes.CREATE_STATUS)
                }
            )
        }

        composable(Routes.CREATE_STATUS) {
            CreateStatusScreen {
                navController.popBackStack()
            }
        }

        composable(Routes.CALLS) {
            CallsScreen {
                navController.popBackStack()
            }
        }

        composable(Routes.PROFILE) {
            ProfileScreen(
                onBack = { navController.popBackStack() },
                onSettings = {
                    navController.navigate(Routes.SETTINGS)
                }
            )
        }

        composable(Routes.SETTINGS) {
            SettingsScreen(
                onBack = { navController.popBackStack() },
                onPrivacy = { navController.navigate(Routes.PRIVACY) },
                onSecurity = { navController.navigate(Routes.SECURITY) },
                onNotifications = {
                    navController.navigate(Routes.NOTIFICATIONS)
                },
                onAppearance = {
                    navController.navigate(Routes.APPEARANCE)
                },
                onStorage = {
                    navController.navigate(Routes.STORAGE)
                },
                onAI = {
                    navController.navigate(Routes.AI)
                }
            )
        }

        composable(Routes.PRIVACY) {
            SimpleSettingsScreen(
                title = "Confidentialité",
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.SECURITY) {
            SimpleSettingsScreen(
                title = "Sécurité",
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.NOTIFICATIONS) {
            SimpleSettingsScreen(
                title = "Notifications",
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.APPEARANCE) {
            SimpleSettingsScreen(
                title = "Apparence",
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.STORAGE) {
            SimpleSettingsScreen(
                title = "Stockage",
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.AI) {
            AiAssistantScreen {
                navController.popBackStack()
            }
        }
    }
}
