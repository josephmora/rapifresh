package com.example.example.data.mocks

import com.example.example.data.models.StoreInfo

class StoreInfoMock {
    fun loadInfo(): StoreInfo {
        return StoreInfo(
            "1",
            "¡Bienvenido a RapiFresh!",
            "https://i.pinimg.com/564x/d6/65/e3/d665e3986d6bf6248c0c8edbef037084.jpg",
            "Avenida Valtimor",
            "Encuentre productos fresco traidos directamente del campo a su mesa."
        )
    }
}