package com.example.bordelmc.designSystem.component.bar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppSearchBar(
    search: String,
    onValueChange: (String) -> Unit

) {
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        value = search,
        onValueChange = {
            onValueChange.invoke(it)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "email")
        },
        trailingIcon = {
            if (search.isNotEmpty()) {
                IconButton(onClick = {
                    onValueChange.invoke("")
                }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "email")
                }

            }
        },
        placeholder = {
            Text(text = "Search here...")
        },
        shape = RoundedCornerShape(20),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        )
    )

}