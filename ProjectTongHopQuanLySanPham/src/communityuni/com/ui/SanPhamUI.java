package communityuni.com.ui;

import communityuni.com.io.JSonFileFactory;
import communityuni.com.model.SanPham;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SanPhamUI {
    private JPanel pnMain;
    private JTable tblSanPham;
    private JTextField txtMa;
    private JTextField txtTen;
    private JTextField txtGia;
    private JButton btnThem;
    private JButton btnTiep;
    private JButton btnXoa;
    private JButton btnThoat;
    private DefaultTableModel modelSanPham;

    private JMenuBar mnuBar;
    private JMenu mnuHeThong;
    private JMenuItem mnuHeThongLuuFile;
    private JMenuItem mnuHeThongDocFile;
    private JMenuItem mnuHeThongThoat;

    private List<SanPham>dsSp=new ArrayList<>();


    public JPanel getPnMain() {
        return pnMain;
    }

    private void createUIComponents() {
        modelSanPham=new DefaultTableModel();
        modelSanPham.addColumn("Mã sản phẩm");
        modelSanPham.addColumn("Tên sản phẩm");
        modelSanPham.addColumn("Đơn giá");
        tblSanPham=new JTable(modelSanPham);


    }
    private void ganHinhChoButton()
    {
        btnThem.setIcon(new ImageIcon("hinh/add.png"));
        btnTiep.setIcon(new ImageIcon("hinh/clear.png"));
        btnXoa.setIcon(new ImageIcon("hinh/delete.png"));
        btnThoat.setIcon(new ImageIcon("hinh/exit.png"));
    }
    public SanPhamUI()
    {
        ganHinhChoButton();
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyThem();
            }
        });
        btnTiep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMa.setText("");
                txtTen.setText("");
                txtGia.setText("");
                txtMa.requestFocus();
            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyXoa();
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyThoat();
            }
        });
        tblSanPham.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if(tblSanPham.getSelectedRow()>=0)
                {
                    SanPham sp=dsSp.get(tblSanPham.getSelectedRow());
                    txtMa.setText(sp.getMa());
                    txtTen.setText(sp.getTen());
                    txtGia.setText(sp.getGia()+"");
                }
            }
        });
    }

    private void xuLyThoat() {
        int ret= JOptionPane.showConfirmDialog(
                null,
                "Thoát phần mềm",
                "Hỏi Thoát",
                JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION)
            System.exit(0);
    }

    private void xuLyXoa() {
        if(tblSanPham.getSelectedRow()>=0)
        {
            dsSp.remove(tblSanPham.getSelectedRow());
            hienThiDanhSachSanPham();
        }
    }

    private void xuLyThem() {
        SanPham sp=new SanPham();
        sp.setMa(txtMa.getText());
        sp.setTen(txtTen.getText());
        sp.setGia(Double.parseDouble(txtGia.getText()));
        dsSp.add(sp);
        hienThiDanhSachSanPham();
    }
    private void hienThiDanhSachSanPham()
    {
        modelSanPham.setRowCount(0);
        for (SanPham sp : dsSp)
        {
            Vector<Object>vec=new Vector<>();
            vec.add(sp.getMa());
            vec.add(sp.getTen());
            vec.add(sp.getGia());
            modelSanPham.addRow(vec);
        }
    }

    public void createMenu(JFrame parent)
    {
        mnuBar=new JMenuBar();
        mnuHeThong=new JMenu("Hệ thống");
        mnuHeThong.setIcon(new ImageIcon("hinh/system.png"));
        mnuBar.add(mnuHeThong);

        mnuHeThongLuuFile=new JMenuItem("Lưu File");
        mnuHeThongLuuFile.setIcon(new ImageIcon("hinh/save.png"));
        mnuHeThong.add(mnuHeThongLuuFile);

        mnuHeThong.addSeparator();

        mnuHeThongDocFile=new JMenuItem("Đọc File");
        mnuHeThongDocFile.setIcon(new ImageIcon("hinh/open.png"));
        mnuHeThong.add(mnuHeThongDocFile);

        mnuHeThong.addSeparator();

        mnuHeThongThoat=new JMenuItem("Thoát");
        mnuHeThongThoat.setIcon(new ImageIcon("hinh/exit.png"));
        mnuHeThong.add(mnuHeThongThoat);

        parent.setJMenuBar(mnuBar);


        mnuHeThongThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnThoat.doClick();
            }
        });
        mnuHeThongLuuFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyLuuFile();
            }
        });
        mnuHeThongDocFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyDocFile();
            }
        });
    }

    private void xuLyDocFile() {
        JFileChooser jfc=new JFileChooser();
        if(jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
            String path = jfc.getSelectedFile().getAbsolutePath();
            JSonFileFactory jff = new JSonFileFactory();
            dsSp=jff.DocDuLieu(path);
            hienThiDanhSachSanPham();
        }

    }

    private void xuLyLuuFile() {
        JFileChooser jfc=new JFileChooser();
        if(jfc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            String path=jfc.getSelectedFile().getAbsolutePath();
            JSonFileFactory jff=new JSonFileFactory();
            boolean kq=jff.LuuDuLieu(dsSp,path);
            if(kq==true)
            {
                JOptionPane.showMessageDialog(
                        null,
                        "Lưu File thành công");
            }
            else
            {
                JOptionPane.showMessageDialog(
                        null,
                        "Lưu File thất bại");
            }
        }
    }
}
