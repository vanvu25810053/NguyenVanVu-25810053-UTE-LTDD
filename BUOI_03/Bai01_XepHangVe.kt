//NguyenVanVu_25810053

fun xepHangVe(){
    val tuoi = 1

    val loaiVe: String = if(tuoi < 10){
        "Ve tre em"
    }else if (tuoi < 50){
        "Ve nguoi lon"
    }else{
        "Ve cao tuoi"
    }
    print(loaiVe)
}


xepHangVe()
