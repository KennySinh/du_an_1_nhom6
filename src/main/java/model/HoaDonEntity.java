package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOADON")
public class HoaDonEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaHD;
    @ManyToOne
    @JoinColumn(name = "MaNV")
    private NhanVienEntity MaNV;
    @ManyToOne
    @JoinColumn(name = "MaKH")
    private KhachHangEntity MaKH;
    private Date NgayTao;
    private int TrangThai;

    public HoaDonEntity() {
    }

    public HoaDonEntity(int MaHD, NhanVienEntity MaNV, KhachHangEntity MaKH, Date NgayTao, int TrangThai) {
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
