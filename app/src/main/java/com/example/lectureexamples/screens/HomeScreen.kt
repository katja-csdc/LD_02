package com.example.lectureexamples.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    
}

@Preview
@Composable
fun Greeting() {
    Column(modifier = Modifier.padding(16.dp)) {
        var name by remember {
            mutableStateOf("")
        }

        /*
        // step 2 - add a mutableStateOf to fire the event for recomposition

       var name = mutableStateOf("")   // use a state holder to register changes
        // var name  by mutableStateOf("")
        Text(text = "Hello ${name.value}!")   // get value of state holder object

        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },    // change its value accordingly
            label = { Text("Name")}
        )
        */



        /*
        // step 3 - use remember
        var name by remember {         // use remember to skip overwriting after first composition
            mutableStateOf("")
        }

        Text(text = "Hello ${name}!")

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name")}
        )

         */
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    //Use a remember state variable to toggle the
    //DropDownMenu when the IconButton from the AppBar is clicked.
    var showMenu by remember { mutableStateOf(false) }

    Scaffold(
        topBar = { TopAppBar(
            title = { Text(text = "HomeScreen") },
            actions = {
                IconButton(onClick = { showMenu = !showMenu }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
                }
                DropdownMenu(expanded = showMenu, onDismissRequest = { showMenu = false }) {
                    DropdownMenuItem(onClick = { /*TODO*/ }) {
                        Row {
                            Icon(imageVector = Icons.Default.Favorite,
                                contentDescription = "my favorites",
                                modifier = Modifier.padding(4.dp)
                            )
                            Text(text = "My Favorites",
                                modifier = Modifier
                                    .padding(4.dp)
                                    .width(100.dp)
                            )
                        }
                    }
                }
            },
        ) }
    ) {
        it
        Text(text = "Hello")
    }
}

/*
            LectureExamplesTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
                    MyApp {
                        Column {
                            MyList()
                        }
                    }
                    //MyList()
                    //Greeting()
                    //WelcomeText(modifier = Modifier.padding(16.dp), text = "welcome to my app!")
//                }
            }
*/
