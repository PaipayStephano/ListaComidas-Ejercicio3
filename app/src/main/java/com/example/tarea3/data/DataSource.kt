package com.example.tarea3.data

import com.example.tarea3.R
import com.example.tarea3.model.Platillo

class DataSource {

    fun loadPlatillos(): List<Platillo> = listOf(
        Platillo(R.string.postre,   R.drawable.postre,   85.0,  "Ahorra hasta el 20%"),
        Platillo(R.string.pozole,   R.drawable.pozole,  100.0,  "Ahorra hasta el 30%"),
        Platillo(R.string.pizza,    R.drawable.pizza,   129.0,  "2x1 hoy"),
        Platillo(R.string.desayuno, R.drawable.desayuno, 90.0,  "Café gratis"),
        Platillo(R.string.tacos,    R.drawable.tacos,    60.0,  "Orden extra -10%"),
        Platillo(R.string.hamburger,R.drawable.hamburger,95.0,  "Combo con papas")
    )
}
