import javax.swing.JFrame

fun main(args: Array<String>) {
    val helloWorldUI:JFrame = JFrame("Hello World")
    //gắn giao diện vào cửa sổ
    helloWorldUI.contentPane = HelloWorldUI().pnMain
    // thiết lập cho phép bấm vào x để đóng cửa sổ
    helloWorldUI.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    // thiết lập kích thước cửa sổ
    helloWorldUI.setSize(350, 250)
    // hiển thị cửa sổ giữu màn hình
    helloWorldUI.setLocationRelativeTo(null)
    // hiển thị giao diện
    helloWorldUI.isVisible = true
}