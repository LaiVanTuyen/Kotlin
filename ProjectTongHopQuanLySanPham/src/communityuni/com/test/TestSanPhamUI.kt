package communityuni.com.test

import communityuni.com.ui.SanPhamUI
import javax.swing.JFrame

fun main(args: Array<String>) {
    var gui:JFrame = JFrame("Chương Trình Quản Lý Sản phẩm")
    var spUI=SanPhamUI()
    gui.contentPane=spUI.pnMain
    spUI.createMenu(gui);
    gui.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    gui.setSize(500,500)
    gui.setLocationRelativeTo(null)
    gui.isVisible=true
}