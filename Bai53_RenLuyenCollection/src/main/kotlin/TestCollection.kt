fun main(args: Array<String>) {
    var ds:MutableList<Int> = mutableListOf()
    while (true)
    {
        println("Nhập giá trị:")
        var x:Int?= readLine()?.toInt()
        if(x==null)continue
        ds.add(x)
        println("Tiếp ko?(c/k):")
        var hoi= readLine()
        if(hoi?.equals("k",true)==true)
        {
            break
        }
    }
    println("Collection sau khi Thím nhập là:")
    for (item in ds)
        print("$item\t")
    println("\nThím muốn sửa số ở vị trí thứ mấy:")
    var vt= readLine()?.toInt()
    if(vt!=null)
        if(vt>=0 &&vt<ds.size)
        {
            println("Mời Thím nhập giá trị mới:")
            var gt= readLine()?.toInt()
            if(gt!=null)
                ds[vt]=gt
        }
    println("Collection sau khi Thím Sửa là:")
    for (item in ds)
        print("$item\t")
    println("\nThím muốn thủ tiêu vị trí nào:")
    var vtXoa= readLine()?.toInt()
    if(vtXoa!=null && vtXoa>=0 && vtXoa<ds.size)
    {
        ds.removeAt(vtXoa)
    }
    println("Collection sau khi Thím Xóa là:")
    for (item in ds)
        print("$item\t")
    println("\nThím muốn tìm số nào:")
    var soTim= readLine()?.toInt()
    if(soTim!=null) {
        var kq = ds.filter { x->x==soTim }
        if(kq.size>0)
            println("Có tìm thấy $soTim")
        else
            println("Ko tìm thấy $soTim")
    }
    ds.sort()
    println("Collection sau khi Thím Sắp tăng dần là:")
    for (item in ds)
        print("$item\t")
    ds.sortDescending()
    println("\nCollection sau khi Thím Sắp giảm dần là:")
    for (item in ds)
        print("$item\t")
}