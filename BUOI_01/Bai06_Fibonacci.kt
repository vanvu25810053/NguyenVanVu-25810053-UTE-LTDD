// Nguyen Van Vu - 25810053

fun inFibonacci() {
    var soTruoc = 0
    var soSau = 1
    var chiSo = 0

    for (i in 0..100) {
        if (soTruoc >= 100) break

        println("Vi tri $chiSo: $soTruoc")

        val fibTiep = soTruoc + soSau
        soTruoc = soSau
        soSau = fibTiep
        chiSo++
    }
}

fun main() {
    inFibonacci()
}