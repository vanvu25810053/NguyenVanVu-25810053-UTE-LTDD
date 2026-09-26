// Nguyen Van Vu - 25810053

fun xuLyVanBan(vanBan: String, xuLy: (String) -> String): String {
    return xuLy(vanBan)
}


fun themDauCham(chuoi: String): String {
    return "$chuoi."
}


val cauGoc = "Xin chao Kotlin"

// Cach 1: truyen lambda viet truc tiep tai cho, trong dau ngoac ()
val ketQua1 = xuLyVanBan(cauGoc, { chuoi -> chuoi.uppercase() })
println("Cach 1 (lambda tai cho): $ketQua1")

// Cach 2: truyen ham da dat ten rieng thong qua toan tu hai dau hai cham ::
val ketQua2 = xuLyVanBan(cauGoc, ::themDauCham)
println("Cach 2 (function reference ::): $ketQua2")

// Cach 3: cu phap tham so cuoi - dua lambda ra ngoai dau ngoac ()
val ketQua3 = xuLyVanBan(cauGoc) { chuoi -> chuoi.reversed() }
println("Cach 3 (trailing lambda): $ketQua3")
