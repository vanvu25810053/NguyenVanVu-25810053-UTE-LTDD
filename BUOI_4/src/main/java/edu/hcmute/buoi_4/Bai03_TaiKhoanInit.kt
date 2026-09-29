package edu.hcmute.buoi_4

class TaiKhoanNganHang(soTaiKhoan: String, soDuBanDau : Double, var soDu : Double = soDuBanDau) {
    init {
        if (soDuBanDau < 0){
            println("So du khong hop le")
        }else{
            println("Tạo tài khoản thành công.So du ban dau: $soDuBanDau VNĐ")
        }
    }
}

fun main(){
    val taiKhoan1 = TaiKhoanNganHang("123456789", 1000.0)
    val taiKhoang2 = TaiKhoanNganHang("987654321", -1.0)
}