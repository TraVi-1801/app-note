package com.example.jetpacknoteapp.feature_note.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object  Descending: OrderType()
}
