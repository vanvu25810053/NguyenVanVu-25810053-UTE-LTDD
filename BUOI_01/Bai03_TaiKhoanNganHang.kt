// Nguyen Van Vu - 25810053

fun tinhSoDu(){
    // vi day la bien co dinh nen khong duoc thay doi trong suot qua trinh thuc hien
    val soDuBD: Long = 5_000_000
    // vi day la bien de cap nhat so du sau moi lan gd nen phai dung var
    var soDuHT: Long = soDuBD

    //Giao dịch nộp thêm 2tr
    soDuHT = soDuHT + 2_000_000
    println("SỐ DƯ HIỆN TẠI SAU KHI NAP: $soDuHT")

    //Giao dịch nộp thêm 2tr
    soDuHT = soDuHT - 1_500_000
    println("SỐ DƯ HIỆN TẠI SAU KHI GIAO DICH: $soDuHT")


}

fun main(){
    tinhSoDu()
}