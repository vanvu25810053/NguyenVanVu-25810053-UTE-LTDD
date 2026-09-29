package edu.hcmute.buoi_4

class KhachHang (var ho: String , var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val cacPhan = value.trim().split(" ")
            ten = cacPhan.last()
            ho = cacPhan.dropLast(1).joinToString(" ")
        }
}

fun main(){
    val khachHang1 = KhachHang("Nguyen", "Van A")
    println("Ho ten: ${khachHang1.hoTen}")

    // Doi gia tri ten - kiem tra hoTen tu dong ghep lai tu gia tri moi nhat
    khachHang1.ten = "B"
    println("Sau khi doi ten: ${khachHang1.hoTen}")

    // Gan hoTen bang mot chuoi ho ten moi - kiem tra tach dung ho va ten
    khachHang1.hoTen = "Tran Thi Cam Tu"
    println("Ho sau khi gan hoTen: ${khachHang1.ho}")
    println("Ten sau khi gan hoTen: ${khachHang1.ten}")
    println("Ho ten sau khi gan: ${khachHang1.hoTen}")
}