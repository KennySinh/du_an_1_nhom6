package view;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;
public class TrangChuJFrame extends javax.swing.JFrame {
    private String user;
    public TrangChuJFrame(String user) {
        initComponents();
        this.user = user;
        this.UserName.setText("Xin chào " + user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSanPham = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTheLoai = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JLabel();
        btn_NhanVien = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JLabel();
        btnHoaDon = new javax.swing.JLabel();
        btn_doihang = new javax.swing.JLabel();
        btnDoanhThu = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JLabel();
        btn_KhachHang = new javax.swing.JLabel();
        btn_HoaDon = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jpn = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PHẦN MỀM QUẢN LÝ BÁN HÀNG ");

        btnSanPham.setText("Sản phẩm");
        btnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseClicked(evt);
            }
        });

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        btnTheLoai.setText("Thể loại");
        btnTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTheLoaiMouseClicked(evt);
            }
        });

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
        });

        btn_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NhanVienMouseClicked(evt);
            }
        });

        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
        });

        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseClicked(evt);
            }
        });

        btn_doihang.setText("Ðôi Hàng");
        btn_doihang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_doihangMouseClicked(evt);
            }
        });

        btnDoanhThu.setText("Doanh Thu");
        btnDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoanhThuMouseClicked(evt);
            }
        });

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });

        btn_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_KhachHangMouseClicked(evt);
            }
        });

        btn_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HoaDonMouseClicked(evt);
            }
        });

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jpn.setLayout(new java.awt.BorderLayout());

        UserName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UserName.setForeground(new java.awt.Color(51, 255, 51));
        UserName.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSanPham)
                                .addGap(52, 52, 52)
                                .addComponent(btnTheLoai)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_NhanVien)
                                .addGap(81, 81, 81)
                                .addComponent(btn_KhachHang)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnKhachHang)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btn_HoaDon)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel17)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel18)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel19)
                                .addGap(151, 151, 151)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnHoaDon)
                                .addGap(52, 52, 52)
                                .addComponent(btn_doihang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)))
                        .addGap(120, 120, 120))
                    .addComponent(jpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addGap(379, 379, 379))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(UserName)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(btn_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_KhachHang)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_HoaDon)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSanPham)
                    .addComponent(btnTheLoai)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang)
                    .addComponent(btnHoaDon)
                    .addComponent(btn_doihang)
                    .addComponent(btnDoanhThu)
                    .addComponent(btnDangXuat))
                .addGap(18, 18, 18)
                .addComponent(jpn, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1391, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseClicked
//        showPannel(new SanPhamPannel(user));
    }//GEN-LAST:event_btnSanPhamMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//        showPannel(new SanPhamPannel(user));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTheLoaiMouseClicked
//        showPannel(new TheLoaiSanPhamPannel(user));
    }//GEN-LAST:event_btnTheLoaiMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        showPannel(new TheLoaiSanPhamPannel(user));
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
//        showPannel(new NhanVienJPN(user));
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btn_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhanVienMouseClicked
//        showPannel(new NhanVienJPN(user));
    }//GEN-LAST:event_btn_NhanVienMouseClicked

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
//        showPannel(new KhachHangJPN(user));
    }//GEN-LAST:event_btnKhachHangMouseClicked

    private void btnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseClicked
//        showPannel(new HoaDonPannel(user));
    }//GEN-LAST:event_btnHoaDonMouseClicked

    private void btn_doihangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_doihangMouseClicked
//        showPannel(new BaoHanhPannel(user));
    }//GEN-LAST:event_btn_doihangMouseClicked

    private void btnDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoanhThuMouseClicked
//        showPannel(new DoanhThu(user));
    }//GEN-LAST:event_btnDoanhThuMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?");
        if (a == 0) {
            this.setVisible(false);
//            new DangNhapJFrame().setVisible(true);
        }
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btn_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KhachHangMouseClicked
//        showPannel(new KhachHangJPN(user));
    }//GEN-LAST:event_btn_KhachHangMouseClicked

    private void btn_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HoaDonMouseClicked
//        showPannel(new HoaDonPannel(user));
    }//GEN-LAST:event_btn_HoaDonMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
//        showPannel(new PhuKienPannel(user));
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
//        showPannel(new BaoHanhPannel(user));
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
//        showPannel(new DoanhThu(user));
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // showPannel(new LichSuThaoTacPannel());
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
//        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?");
//        if (a == 0) {
//            this.setVisible(false);
//            new DangNhapJFrame().setVisible(true);
//        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TrangChuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel btnDangXuat;
    private javax.swing.JLabel btnDoanhThu;
    private javax.swing.JLabel btnHoaDon;
    private javax.swing.JLabel btnKhachHang;
    private javax.swing.JLabel btnNhanVien;
    private javax.swing.JLabel btnSanPham;
    private javax.swing.JLabel btnTheLoai;
    private javax.swing.JLabel btn_HoaDon;
    private javax.swing.JLabel btn_KhachHang;
    private javax.swing.JLabel btn_NhanVien;
    private javax.swing.JLabel btn_doihang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpn;
    // End of variables declaration//GEN-END:variables
}
