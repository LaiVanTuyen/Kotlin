fun main(args: Array<String>) {
    var ds:MutableList<Int> = mutableListOf()
    ds.add(5)
    ds.add(11)
    ds.add(8)
    ds.addAll(mutableListOf(2,7,4))
    for (item in ds)
        print("$item\t")
    ds.sort()
    println("\nSắp xếp tăng dần:")
    for (item in ds)
        print("$item\t")
    ds.sortDescending()
    println("\nSắp xếp giảm dần:")
    for (item in ds)
        print("$item\t")
    ds.removeAt(2)
    println("\nSau khi xóa số 7:")
    for (item in ds)
        print("$item\t")
    var dsLe=ds.filter { x->x%2!=0 }
    println("\nCác số lẻ là:")
    for (item in dsLe)
        print("$item\t")
    ds.add(3,9)
    println("\nSau khi chèn 9:")
    for (item in ds)
        print("$item\t")
    ds[1]=88
    println("\nSau khi sửa 8 thành 88:")
    for (item in ds)
        print("$item\t")
}