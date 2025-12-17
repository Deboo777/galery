package com.example.galery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import kotlin.math.round

@Composable
fun Sc2(onClickButton: () -> Boolean) {
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