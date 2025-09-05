package com.example.tarea3.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceID: Int,   // Nombre
    @DrawableRes val drawableResourceID: Int, // Imagen
    val precio: Double,                     // Precio
    val oferta: String                      // Texto de oferta
)