// Nguyen Van Vu - 25810053

fun main() {

    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    val matKhau1 = "abc123"
    val matKhau2 = "matkhau2024"
    val matKhau3 = "xyz789"

    println("$matKhau1 -> ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 -> ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 -> ${kiemTraDoDai(matKhau3)}")
}