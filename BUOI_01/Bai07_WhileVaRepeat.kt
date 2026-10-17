// Nguyen Van Vu - 25810053

//Dung khi mua duyet qua tung gia tri
fun demNguocByWhile() {
    var soHienTai: Int = 10

    while (soHienTai >= 1) {
        println("SỐ HIỆN TẠI $soHienTai")
        soHienTai--
    }
}
//Dung khi muon lap lai 1 doan co dinh nao do
fun inCoDinh(){
    repeat(5){
        println("Số cố định")
    }
}
fun main() {
    demNguocByWhile()
    inCoDinh()
}