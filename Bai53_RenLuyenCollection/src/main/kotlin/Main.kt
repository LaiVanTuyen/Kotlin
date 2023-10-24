fun main(args: Array<String>) {
    val ds: MutableList<Int> = mutableListOf()
    while (true) {
        println("Nhập giá trị:")
        val x: Int = readlnOrNull()?.toInt() ?: continue
        ds.add(x)
        println("Tiếp ko?(c/k):")
        val hoi = readlnOrNull()
        if (hoi?.equals("k", true) == true) {
            break
        }
    }
    println("Collection sau khi nhập là: $ds")
    println("Muốn sửa số ở vị trí thứ mấy:")
    val vt:Int = readlnOrNull()?.toInt() ?: -1
    if (vt in 0..<ds.size) {
        println("Mời nhập giá trị mới:")
        val gt: Int = readlnOrNull()?.toInt() ?: -1
        if (gt >= 0) {
            ds[vt] = gt
        }
    }
    println("Collection sau khi sửa là: $ds")
    println("Muốn xóa vị trí nào:")
    val vtXoa: Int = readlnOrNull()?.toInt() ?: -1
    if (vtXoa in 0 .. ds.size) {
        ds.removeAt(vtXoa)
    }
    println("Collection sau khi xóa là: $ds")
    println("Muốn tìm số nào:")
    val soTim: Int = readlnOrNull()?.toInt() ?: -1
    if (soTim >= 0) {
        val kq = ds.filter { x -> x == soTim }
        if (kq.size > 0)
            println("Có tìm thấy $soTim")
        else
            println("Ko tìm thấy $soTim")
    }
    println("Collection sau khi sắp tăng dần là: ${ds.sorted()}") // ds.sort()
    println("Collection sau khi sắp giảm dần là: ${ds.sortedDescending()}") // ds.sortDescending()
}