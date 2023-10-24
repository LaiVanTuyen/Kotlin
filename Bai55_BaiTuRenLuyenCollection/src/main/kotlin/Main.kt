fun main() {
    val students = mutableListOf<String>()

    while (true) {
        println("----- Quản Lý Tên Sinh Viên -----")
        println("1. Thêm Sinh viên")
        println("2. Xuất danh sách sinh viên")
        println("3. Sửa Sinh viên")
        println("4. Xóa Sinh viên chứa tên bất kỳ")
        println("5. Tìm Sinh viên theo tên")
        println("6. Sắp xếp Sinh viên")
        println("7. Xuất ra số lượng sinh viên")
        println("8. Thoát chương trình")

        print("Chọn một tùy chọn: ")
        val choice = readlnOrNull() ?: ""

        when (choice) {
            "1" -> {
                print("Nhập tên sinh viên: ")
                val studentName = readlnOrNull() ?: ""
                students.add(studentName)
                println("$studentName đã được thêm vào danh sách.")
            }
            "2" -> {
                if (students.isEmpty()) {
                    println("Danh sách sinh viên rỗng.")
                } else {
                    println("Danh sách sinh viên:")
                    students.forEachIndexed { index, student ->
                        println("${index + 1}. $student")
                    }
                }
            }
            "3" -> {
                print("Nhập vị trí cần sửa (1-${students.size}): ")
                val index = readlnOrNull()?.toIntOrNull() ?: 0
                if (index in 1..students.size) {
                    print("Nhập tên mới: ")
                    val newStudentName = readlnOrNull() ?: ""
                    students[index - 1] = newStudentName
                    println("Sửa thành công.")
                } else {
                    println("Vị trí không hợp lệ.")
                }
            }
            "4" -> {
                print("Nhập tên để xóa: ")
                val nameToDelete = readlnOrNull() ?: ""
                val removed = students.removeIf { it.contains(nameToDelete, ignoreCase = true) }
                if (removed) {
                    println("Sinh viên có tên '$nameToDelete' đã được xóa.")
                } else {
                    println("Không tìm thấy sinh viên có tên '$nameToDelete'.")
                }
            }
            "5" -> {
                print("Nhập tên cần tìm: ")
                val nameToFind = readlnOrNull() ?: ""
                val foundStudents = students.filter { it.contains(nameToFind, ignoreCase = true) }
                if (foundStudents.isNotEmpty()) {
                    println("Sinh viên có tên chứa '$nameToFind':")
                    foundStudents.forEachIndexed { index, student ->
                        println("${index + 1}. $student")
                    }
                } else {
                    println("Không tìm thấy sinh viên có tên chứa '$nameToFind'.")
                }
            }
            "6" -> {
                students.sort()
                println("Danh sách sinh viên đã được sắp xếp theo thứ tự alphabet.")
            }
            "7" -> {
                val count = students.size
                println("Tổng số sinh viên trong danh sách: $count")
            }
            "8" -> {
                println("Thoát chương trình.")
                return
            }
            else -> {
                println("Tùy chọn không hợp lệ. Vui lòng chọn lại.")
            }
        }
    }
}
