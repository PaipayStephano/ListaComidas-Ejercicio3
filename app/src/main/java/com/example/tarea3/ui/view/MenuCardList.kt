package com.example.tarea3.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tarea3.model.Platillo

@Composable
fun MenuCardList(
    platilloList: List<Platillo>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(platilloList) { platillo ->
            MenuCard(
                platillo = platillo,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}