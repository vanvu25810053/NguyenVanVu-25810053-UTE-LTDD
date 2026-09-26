// Nguyen Van Vu - 25810053


val nhacCu = listOf(
    "Guitar", "Piano", "Violin", "Trong", "Trumpet",
    "Ukulele", "Cello", "Harp", "Trombone", "Flute"
)

val kyTuDau = 'T'

// Cach 1: loc thong thuong bang filter - eager (thuc thi ngay lap tuc,
// duyet toan bo danh sach va tao ra mot List moi ngay khi goi filter)
val ketQuaFilter = nhacCu.filter { it.startsWith(kyTuDau) }
println("Loc bang filter thuong: $ketQuaFilter")

// Cach 2: loc qua Sequence - lazy (khong xu ly ngay, chi "lap ke hoach"
// cac buoc xu ly, va chi thuc su chay khi goi toList() de "chot" ket qua)
val ketQuaSequence = nhacCu.asSequence()
    .filter { it.startsWith(kyTuDau) }
    .toList()
println("Loc bang asSequence + filter + toList: $ketQuaSequence")

// Nen dung Sequence khi danh sach rat lon va co nhieu phep bien doi
// noi tiep nhau (filter, map...), vi Sequence xu ly tung phan tu qua
// het chuoi thao tac roi moi sang phan tu tiep theo, tranh tao ra
// nhieu danh sach trung gian nhu cach filter thuong lam.
