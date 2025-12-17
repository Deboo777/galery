package com.example.galery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlin.math.round

@Composable
fun NavigationGraph() {
    val navController = rememberNavController() // Create a NavController
    NavHost(navController, startDestination = "Sc1") {
        composable("Sc1") { Sc1 (navController) }
        composable("Sc2") { Sc2 () }
        composable("Sc3") { Sc3 () }
        composable("Sc4") { Sc4 () }
    }
}
@Composable
fun Sc1(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Выбери галерею")
        Button(onClick = { navController.navigate("Sc2") }) {
        Text("Memas")
        }
        Button(onClick = { navController.navigate("Sc3") }) {
            Text("Kotiki")
        }
        Button(onClick = { navController.navigate("Sc4") }) {
            Text("Memas")
        }
    }

}

@Composable
fun Sc2() {
    // Динамический список
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {

            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem1), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) {
                    OutlinedTextField(
                        label = { Text("Введите текст") },
                        value = text.value,
                        onValueChange = { text.value = it }
                    )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }
                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem2), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            {   val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem3), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem4), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem5), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }


        }



    }
}
@Composable
fun Sc3() {
    // Динамический список
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {

            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.kot1), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) {
                    OutlinedTextField(
                        label = { Text("Введите текст") },
                        value = text.value,
                        onValueChange = { text.value = it }
                    )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.kot2), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            {   val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.kot3), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.kot4), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.kot5), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }


        }



    }
}
@Composable
fun Sc4() {
    // Динамический список
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {

            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem1), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) {
                    OutlinedTextField(
                        label = { Text("Введите текст") },
                        value = text.value,
                        onValueChange = { text.value = it }
                    )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem2), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            {   val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem3), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem4), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }
            Row(modifier = Modifier.fillMaxSize(),)
            { val switch = remember { mutableStateOf(false) }
                if(switch.value){
                    Image(painter = painterResource(R.drawable.memvagno), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                else{
                    Image(painter = painterResource(R.drawable.mem5), contentDescription = null ,contentScale = ContentScale.Crop, modifier = Modifier.size(150.dp))
                }
                val text = remember { mutableStateOf("") }
                Column(modifier = Modifier.fillMaxSize()) { OutlinedTextField(
                    label = { Text("Введите текст") },
                    value = text.value,
                    onValueChange = { text.value = it }
                )
                    Text(text = text.value)
                    Switch(checked = switch.value, onCheckedChange = { switch.value = it })
                    val sliderPosition = remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = sliderPosition.value,
                        onValueChange = {
                            sliderPosition.value = it
                        },
                        steps = 10,
                        valueRange = 1f..10f
                    )
                    Text(text = round(sliderPosition.value).toString())
                }
            }


        }



    }
}

