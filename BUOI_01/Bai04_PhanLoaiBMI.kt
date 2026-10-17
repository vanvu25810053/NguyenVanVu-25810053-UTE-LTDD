// Nguyen Van Vu - 25810053

fun tinhBMI(){
    val canNang: Int = 60
    val chieuCao: Double = 1.8

    val chiSo = canNang / (chieuCao * chieuCao)

    if (chiSo < 18.5){
        println("CƠ THỂ THIẾU CÂN (GẦY)")
    }else if(chiSo < 22.9){
        println("TRẠNG THÁI CÂN ĐỐI (BÌNH THƯỜNG)")
    }else if(chiSo < 24.9){
        println("CÂN NẶNG VƯỢT MỨC TIÊU CHUẨN BÌNH THƯỜNG")
    }else{
        println("CƠ THỂ BÉO PHÌ")
    }

}

fun main(){
    tinhBMI()
}