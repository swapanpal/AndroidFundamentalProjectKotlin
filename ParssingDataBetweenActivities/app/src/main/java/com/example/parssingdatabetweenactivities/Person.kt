package com.example.parssingdatabetweenactivities

import java.io.Serializable

data class Person (
    val name : String,
    val age : Int,
    val country : String
        ) : Serializable    // if we want to use this to others activity than use 'Serializable'


