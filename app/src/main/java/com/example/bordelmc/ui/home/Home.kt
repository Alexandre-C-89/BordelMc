package com.example.bordelmc.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.bordelmc.TodoViewModel
import com.example.bordelmc.ui.component.AppBar
import com.example.bordelmc.ui.component.AppBottomBar
import com.example.bordelmc.ui.component.AppScaffold

@Composable
fun HomeRoute(

) {
    val vm = TodoViewModel()
    HomeScreen(vm)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    vm: TodoViewModel
) {
    LaunchedEffect(Unit, block = {
        vm.getTodoList()
    })
    AppScaffold(
        topBar = { AppBar() },
        bottomBar = { AppBottomBar() }
    ) {
        if (vm.errorMessage.isEmpty()) {
            Column(modifier = Modifier.padding(16.dp)) {
                LazyColumn(modifier = Modifier.fillMaxHeight()) {
                    items(vm.todoList) { todo ->
                        Column {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(0.dp, 0.dp, 16.dp, 0.dp)
                                ) {
                                    Text(
                                        todo.title,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }
                                Spacer(modifier = Modifier.width(16.dp))
                                Checkbox(checked = todo.completed, onCheckedChange = null)
                            }
                            Divider()
                        }
                    }
                }
            }
        } else {
            Text(vm.errorMessage)
        }

    }
}