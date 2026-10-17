// Nguyen Van Vu - 25810053

fun quanLySach() {
    val danhSachSach = mutableListOf(
        "Doc Chuoi",
        "Nha Gia Kim",
        "Toi Thay Hoa Vang Tren Co Xanh",
        "Cay Cam Ngot Cua Toi",
        "Dac Nhan Tam"
    )

    println("DANH SÁCH :")
    println(danhSachSach)

    // Thêm 2 cuốn sách mới vào danh sách
    danhSachSach.add("Nhat Ky Trong Tu")
    danhSachSach.add("Bay Thoi Quen Hieu Qua")

    // Xoá 1 cuốn sách theo tên
    danhSachSach.remove("Dac Nhan Tam")

    // Sắp xếp danh sách theo thứ tự chữ cái
    danhSachSach.sort()

    println("Danh sach sach sau khi them, xoa, sap xep:")
    println(danhSachSach)
}

fun main() {
    quanLySach()
}