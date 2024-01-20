/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone

data class List<T>(
    val objectType: String = "list",
    val totalObjects: Int,
    val hasMore: Boolean,
    val nextPage: String,
    val data: ArrayList<T>,
)
