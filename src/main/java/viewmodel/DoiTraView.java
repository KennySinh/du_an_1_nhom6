
package viewmodel;
import model.KhachHangEntity;
import model.NhanVienEntity;
import model.SanPhamEntity;
import model.HoaDonEntity;
import java.util.Date;
public class DoiTraView {
    private int MaDTH;
    private HoaDonEntity MaHD;
    private Date NgayDTH;
    private String MoTa;

    public DoiTraView() {
    }

    public DoiTraView(int MaDTH, HoaDonEntity MaHD, Date NgayDTH, String MoTa) {
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
