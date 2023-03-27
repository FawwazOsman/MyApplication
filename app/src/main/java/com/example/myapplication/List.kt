package com.example.myapplication

import kotlin.collections.List

class List {

    val wordList = listOf<String>("fruit","dubai","break","honda","boats","cloud","brand","glass","heart",
        "cream","lunch","towel","sharp","shine","stone","earth","eight","phone","mouse","brace","linux","class","grain")

    fun getWords(): List<String> {
        return wordList
    }
}
