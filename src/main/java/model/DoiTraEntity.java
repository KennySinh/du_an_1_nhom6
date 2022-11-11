package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DOITRAHANG")
public class DoiTraEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaDTH;
    @ManyToOne
    @JoinColumn(name = "MaHD")
    private HoaDonEntity MaHD;
    private Date NgayDTH;
    private String MoTa;

    public DoiTraEntity() {
    }

    public DoiTraEntity(int MaDTH, HoaDonEntity MaHD, Date NgayDTH, String MoTa) {
        this.MaDTH = MaDTH;
        this.MaHD = MaHD;
        this.NgayDTH = NgayDTH;
        this.MoTa = MoTa;
    }

    public int getMaDTH() {
        return MaDTH;
    }

    public void setMaDTH(int MaDTH) {
        this.MaDTH = MaDTH;
    }

    public HoaDonEntity getMaHD() {
        return MaHD;
    }

    public void setMaHD(HoaDonEntity MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayDTH() {
        return NgayDTH;
    }

    public void setNgayDTH(Date NgayDTH) {
        this.NgayDTH = NgayDTH;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

}
