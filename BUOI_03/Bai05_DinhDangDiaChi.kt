// Nguyen Van Vu - 25810053

fun dinhDangDiaChi(
    tenDuong: String,
    thanhPho: String,
    soNha: String = "Chua co",
    toaNha: String = "Khong co",
    ghiChuGiaoHang: String = "Khong co ghi chu"
) {
    println("Dia chi: $soNha, $tenDuong, $thanhPho")
    println("Toa nha: $toaNha")
    println("Ghi chu giao hang: $ghiChuGiaoHang")
}


dinhDangDiaChi(
    "Vo Van Ngan",
    "Thu Duc",
    soNha = "01",
    toaNha = "Chung cu Sunview",
    ghiChuGiaoHang = "Giao gio hanh chinh"
)

dinhDangDiaChi(
    "Le Van Viet",
    "Quan 9",
    ghiChuGiaoHang = "Goi truoc khi giao"
)
