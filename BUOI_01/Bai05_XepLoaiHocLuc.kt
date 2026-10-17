// Nguyen Van Vu - 25810053

fun xetHocLuc(){
    val diemTB: Double = 9.5

    when(diemTB){
        in 0.0..4.0 -> println("HỌC LỰC YẾU")
        in 4.0..6.9 -> println("HỌC LỰC TRUNG BÌNH")
        in 7.0..8.0 -> println("HỌC LỰC KHÁ")
        in 8.0..9.4 -> println("HỌC LỰC GIỎI")
        else -> println("HỌC LỰC XUẤT SẮC")
    }


}

fun main(){
    xetHocLuc()
}