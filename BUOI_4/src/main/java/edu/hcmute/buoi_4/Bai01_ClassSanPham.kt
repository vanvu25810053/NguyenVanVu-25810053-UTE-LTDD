package edu.hcmute.buoi_4

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    // Object thứ nhất: truyền đủ 3 giá trị theo đúng thứ tự
    val sp1 = SanPham("Laptop Dell XPS", 25000000.0, 15)

    // Object thứ hai: chỉ truyền 2 tham số bắt buộc bằng named argument, soLuongTonKho lấy mặc định (0)
    val sp2 = SanPham(tenSanPham = "Chuột không dây Logitech", gia = 350000.0)

    println("=== THÔNG TIN SẢN PHẨM 1 ===")
    println("Tên sản phẩm    : ${sp1.tenSanPham}")
    println("Giá bán         : ${sp1.gia} VNĐ")
    println("Số lượng tồn kho: ${sp1.soLuongTonKho}")

    println()

    println("=== THÔNG TIN SẢN PHẨM 2 ===")
    println("Tên sản phẩm    : ${sp2.tenSanPham}")
    println("Giá bán         : ${sp2.gia} VNĐ")
    println("Số lượng tồn kho: ${sp2.soLuongTonKho}")
}
