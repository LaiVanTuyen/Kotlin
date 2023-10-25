package com.test

import ui.SanPhamUI
import javax.swing.JFrame

fun main(args: Array<String>) {
    var gui:JFrame = JFrame("Chương trình quản lý sản phẩm")
    gui.contentPane = SanPhamUI().pnMain
    gui.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    gui.setSize(500,500)
    gui.setLocationRelativeTo(null)
    gui.isVisible=true
}