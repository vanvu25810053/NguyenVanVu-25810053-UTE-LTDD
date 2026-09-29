package edu.hcmute.buoi_4

class TaiKhoanNganHang_B5(soTaiKhoan: String, soDuBanDau : Double, var soDu : Double = soDuBanDau) {
    init {
        if (soDuBanDau < 0){
            println("So du khong hop le")
        }else{
            println("Tạo tài khoản thành công.So du ban dau: $soDuBanDau VNĐ")
        }
    }

    fun napTien(soTien: Double){
        soDu = soDu + soTien
    }

    fun rutTien(soTien: Double) : Boolean{
        if(soDu < soTien){
            return false
        }else{
            soDu = soDu - soTien
            return true
        }
    }
}

fun  main(){
    val tk = TaiKhoanNganHang_B5("123456789", 100000.0)
    tk.napTien(50000.0)
    println("So du hien tai: ${tk.soDu} VNĐ")

    for(i in 1..5){
        if(tk.rutTien(50000.0)){
            println("Rut tien thanh cong")
        }else{
            println("So du khong du")
        }
    }
    println("So du hien tai: ${tk.soDu} VNĐ")

}