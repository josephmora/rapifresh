package com.example.example
import android.util.Patterns
//extension de un metodo
fun CharSequence?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

//compara un el valor de un campo de texto (CharSequence) con una expresion regular que intergara android (EMAIL_ADDRESS)