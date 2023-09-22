package com.plcoding.jetpackcomposepokedex.data.models

import kotlin.random.Random

data class PokedexListEntry(
    val number: Int,
    val pokemonName: String,
    val imageUrl: String,
    var isSeen: Boolean = false,
    var isCaught: Boolean = false,
) {
    init {
        this.isSeen = Random.nextBoolean()
        this.isCaught = this.isSeen && Random.nextBoolean()
    }
}
