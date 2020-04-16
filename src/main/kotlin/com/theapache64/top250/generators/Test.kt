package com.theapache64.top250.generators

import com.google.gson.Gson
import com.google.gson.GsonBuilder

fun main() {
    val list = listOf("C", "D", "E", "A", "B").sortedBy { it }
    val gson = GsonBuilder().setPrettyPrinting().create();
    println(gson.toJson(list))
}