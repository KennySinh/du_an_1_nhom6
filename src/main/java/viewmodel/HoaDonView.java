package viewmodel;

import java.util.Date;
import model.KhachHangEntity;
import model.NhanVienEntity;

public class HoaDonView {

    private int MaHD;
    private NhanVienEntity MaNV;
    private KhachHangEntity MaKH;
    private Date NgayTao;
    private int TrangThai;

    public HoaDonView() {
    }

    public HoaDonView(int MaHD, NhanVienEntity MaNV, KhachHangEntity MaKH, Date NgayTao, int TrangThai) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.NgayTao = NgayTao;
        this.TrangThai = TrangThai;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public NhanVienEntity getMaNV() {
        return MaNV;
    }

    public void setMaNV(NhanVienEntity MaNV) {
        this.MaNV = MaNV;
    }

    public KhachHangEntity getMaKH() {
        return MaKH;
    }

    public void setMaKH(KhachHangEntity MaKH) {
        this.MaKH = MaKH;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

   
    
}
