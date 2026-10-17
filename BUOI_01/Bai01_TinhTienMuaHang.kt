// Nguyen Van Vu - 25810053

fun tinhTien(){
    var soLuong: Int = 10;
    var donGia: Double = 7.5;

    val thanhTien = soLuong.toDouble() * donGia
    val thue = thanhTien * 0.08
    val tongTien = thanhTien + thue

    println("Tổng tiền: $tongTien VNĐ")
}

fun main(){
    tinhTien()
}