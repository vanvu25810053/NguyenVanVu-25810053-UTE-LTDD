// Nguyen Van Vu - 25810053

// Ban day du
fun binhPhuongDayDu(x: Int): Int {
    return x * x
}

// Ban rut gon
fun binhPhuongRutGon(x: Int): Int = x * x


// Ban day du - co return
fun chuViDayDu(canh: Double): Double {
    return canh * 4
}

// Ban rut gon
fun chuViRutGon(canh: Double): Double = canh * 4


// Ban day du - co return
fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}

// Ban rut gon
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0


println("Binh phuong 5:")
println("  Day du: ${binhPhuongDayDu(5)}")
println("  Rut gon: ${binhPhuongRutGon(5)}")

println("Chu vi hinh vuong canh 3.5:")
println("  Day du: ${chuViDayDu(3.5)}")
println("  Rut gon: ${chuViRutGon(3.5)}")

println("Kiem tra so 8 co phai so chan:")
println("  Day du: ${laSoChanDayDu(8)}")
println("  Rut gon: ${laSoChanRutGon(8)}")
