package service;
import model.HoaDonEntity;
import repositories.HoaDonDAO;
import viewmodel.HoaDonView;
import java.util.ArrayList;
import java.util.List;
public class HoaDonService {
    HoaDonDAO _HoaDonDAO;

    public HoaDonService() {
    }
      public List<HoaDonEntity> getList(){
        return _HoaDonDAO.getList();
    }
    public List<HoaDonEntity> getListThanhToan(){
        return _HoaDonDAO.getListThanhToan();
    }
    public String add(HoaDonView x){
        return _HoaDonDAO.save(new HoaDonEntity(x.getMaHD(), x.getMaNV(), x.getMaKH(), x.getNgayTao(), x.getTrangThai()));
    }
    public String edit(HoaDonView x){
        return _HoaDonDAO.update(new HoaDonEntity(x.getMaHD(), x.getMaNV(), x.getMaKH(), x.getNgayTao(), x.getTrangThai()));
    }
    public List timKiemHoaDon(int ma){
        List<HoaDonEntity> dons = new ArrayList<>();
        for (HoaDonEntity x : _HoaDonDAO.getListThanhToan()) {
            if(x.getMaKH().getMaKH() == ma){
                dons.add(x);
            }
        }
        return dons;
    }
}
