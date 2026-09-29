package edu.hcmute.buoi_4.Bai06_KeThuaDongVat

fun main(){
    val dsDongVat = listOf(
        Cho("PogPog"),
        Meo("Mull"),
        Cho("SOC"),
        Meo("HIMASS")
    )

    for (dongVat in dsDongVat) {
        println("${dongVat.ten}: kêu ${dongVat.keu()}")
    }
}