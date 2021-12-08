package com.example.example.data.models

class StoreInfo(
    var id:String,
    var name: String,
    var image: String,
    var address: String,
    var description: String,
    var lat: Double?=null,
    var lng: Double?=null
)