package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class SanPhamUI {
    private JPanel pnMain;
    private JTable tblSanPham;
    private DefaultTableModel modelSanPham;
    private JTextField txtMa;
    private JTextField txtTen;
    private JTextField txtDonGia;
    private JButton btnLuu;
    private JButton btnTiep;
    private JButton btnXoa;
    private JButton btnThoat;

    public SanPhamUI() {
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnLuu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyLuu();
            }
        });
        btnTiep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMa.setText("");
                txtTen.setText("");
                txtDonGia.setText("");
                txtMa.requestFocus();
            }
        });
        tblSanPham.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int row= tblSanPham.getSelectedRow();
                if(row>=0)
                {
                    String ma=tblSanPham.getValueAt(row,0)+"";
                    String ten=tblSanPham.getValueAt(row,1)+"";
                    String gia=tblSanPham.getValueAt(row,2)+"";
                    txtMa.setText(ma);
                    txtTen.setText(ten);
                    txtDonGia.setText(gia);
                }
            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tblSanPham.getSelectedRow()>=0)
                    modelSanPham.removeRow(tblSanPham.getSelectedRow());
            }
        });
    }

    private void xuLyLuu() {
        Vector<String> vec=new Vector<>();
        vec.add(txtMa.getText());
        vec.add(txtTen.getText());
        vec.add(txtDonGia.getText());
        modelSanPham.addRow(vec);
    }

    public JPanel getPnMain() {
        return pnMain;
    }

    private void createUIComponents() {
       modelSanPham=new DefaultTableModel();
       modelSanPham.addColumn("Mã sản phẩm");
       modelSanPham.addColumn("Tên sản phẩm");
       modelSanPham.addColumn("Giá sản phẩm");
       tblSanPham=new JTable(modelSanPham);
    }
}
