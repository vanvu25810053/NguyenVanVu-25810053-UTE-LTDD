package edu.hcmute.buoi_4.Bai07_InterfaceDienTich

class HinhVuong(val canh: Double): CoTheTinhDienTich  {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}