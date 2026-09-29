package edu.hcmute.buoi_4.Bai07_InterfaceDienTich

fun main(){
    val hv = HinhVuong(canh = 3.0)
    val hcn = HinhCN(chieuDai = 3.0, chieuRong = 4.0)

    println("Dien tich hinh vuong: ${hv.tinhDienTich()} m*2")
    println("Dien tich hinh CN: ${hcn.tinhDienTich()} m*2")
}