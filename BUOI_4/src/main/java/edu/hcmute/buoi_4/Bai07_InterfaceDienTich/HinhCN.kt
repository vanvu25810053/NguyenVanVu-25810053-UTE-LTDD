package edu.hcmute.buoi_4.Bai07_InterfaceDienTich

class HinhCN(val chieuDai: Double, val chieuRong: Double): CoTheTinhDienTich  {
    override fun tinhDienTich(): Double {
        return chieuDai*chieuRong
    }
}