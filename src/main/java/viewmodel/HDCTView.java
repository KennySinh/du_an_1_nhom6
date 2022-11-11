package viewmodel;

import model.KhachHangEntity;
import model.NhanVienEntity;
import java.util.Date;
import model.HoaDonEntity;
import model.SanPhamEntity;
public class HDCTView {
    private int ID;
    private HoaDonEntity MaHD;
    private SanPhamEntity MaSP;
    private int SoLuong;
    private float DonGia;
    private float TongTien;

    public HDCTView() {
    }

    public HDCTView(int ID, HoaDonEntity MaHD, SanPhamEntity MaSP, int SoLuong, float DonGia, float TongTien) {
        this.ID = ID;
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TongTien = TongTien;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public HoaDonEntity getMaHD() {
        return MaHD;
    }

    public void setMaHD(HoaDonEntity MaHD) {
        this.MaHD = MaHD;
    }

    public SanPhamEntity getMaSP() {
        return MaSP;
    }

    public void setMaSP(SanPhamEntity MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    
    
}
