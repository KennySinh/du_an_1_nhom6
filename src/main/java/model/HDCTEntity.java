package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOADONCHITIET")
public class HDCTEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @ManyToOne
    @JoinColumn(name = "MaHD")
    private HoaDonEntity MaHD;
    @ManyToOne
    @JoinColumn(name = "MaSP")
    private SanPhamEntity MaSP;
    private int SoLuong;
    private float DonGia;
    private float TongTien;

    public HDCTEntity() {
    }

    public HDCTEntity(int ID, HoaDonEntity MaHD, SanPhamEntity MaSP, int SoLuong, float DonGia, float TongTien) {
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
