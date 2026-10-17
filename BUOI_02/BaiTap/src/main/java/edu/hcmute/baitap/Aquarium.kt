package edu.hcmute.baitap

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun inc(){
        println("Width: $width cm " +12)
    }
}

fun main(){
    Aquarium().inc()
}