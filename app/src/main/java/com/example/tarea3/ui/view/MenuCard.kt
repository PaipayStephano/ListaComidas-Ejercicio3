package com.example.tarea3.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import com.example.tarea3.model.Platillo

@Composable
fun MenuCard(
    platillo: Platillo,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp)
    ) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            // Imagen circular
            Image(
                painter = painterResource(platillo.drawableResourceID),
                contentDescription = stringResource(platillo.stringResourceID),
                modifier = Modifier
                    .size(180.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.width(16.dp))

            // Nombre (tamaño título), precio normal, oferta destacada
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(platillo.stringResourceID),
                    style = MaterialTheme.typography.headlineLarge // título grande
                )
                Text(
                    text = "MX $${"%.1f".format(platillo.precio)}",
                    style = MaterialTheme.typography.bodyLarge      // “normal”
                )
                Text(
                    text = platillo.oferta,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color(0xFF0047FF) // azul intenso para resaltar
                )
            }
        }
    }
}

