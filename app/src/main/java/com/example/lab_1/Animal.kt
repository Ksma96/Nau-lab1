package com.example.lab_1

import java.io.Serializable

data class Animal(
    val name: String,
    val slogan: String,
    val longDescription: String,
    val smallImageRes: Int,
    val bigImageRes: Int
): Serializable