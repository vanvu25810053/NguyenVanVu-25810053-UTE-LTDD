package edu.hcmute.buoi_4

class NhanVien(maNhanVien: String, val hoTen: String, var luong: Double){
    constructor(ten: String): this("TAM", ten, 0.0)
}
fun main(){

    val nv1 = NhanVien("NV001", "Nguyen Van A", 8_000_000.0)

    val nv2 = NhanVien("Tran Thi B")

    // println(nv1.maNhanVien)
    // Dong nay se bao loi bien dich neu bo comment, vi maNhanVien khai bao
    // trong constructor chinh KHONG co val/var phia truoc, nen no chi la
    // mot tham so tam thoi cua constructor (chi dung duoc ben trong than
    // class), khong tro thanh property cua class,
    // nen khong the truy cap tu ben ngoai qua nv1.maNhanVien duoc.

    println("nv1 - Ten: ${nv1.hoTen}, Luong : ${nv1.luong}")
    println("nv2 - Ten: ${nv2.hoTen}, Luong : ${nv2.luong}")
}