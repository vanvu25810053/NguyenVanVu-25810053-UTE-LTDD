//NguyenVanVu_25810053

fun datBan (tenKH: String, soLuong: Int, loaiBan: String = "Ban Thuong" ) {
   println("KHÁCH HÀNG: $tenKH - SỐ LƯỢNG NGƯỜI: $soLuong - LOẠI BÀN: $loaiBan")
}


datBan("NGUYÊN VĂN VŨ", 5)
datBan("TRẦN VĂN BẢN", 10, "VIP")
datBan(tenKH = "GIẤU TÊN", soLuong = 9 , loaiBan = "LUXURY")