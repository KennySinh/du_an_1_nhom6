package service;

import model.HDCTEntity;
import repositories.HDCTDAO;
import viewmodel.HDCTView;
import java.util.ArrayList;
import java.util.List;

public class HDCTService {

    HDCTDAO hdctdao;

    public HDCTService() {
        hdctdao = new HDCTDAO();
    }

    public List<HDCTEntity> getList() {
        return hdctdao.getList();
    }

    public String add(HDCTView x) {
        return hdctdao.save(new HDCTEntity(x.getID(), x.getMaHD(), x.getMaSP(), x.getSoLuong(), x.getDonGia(), x.getTongTien()));
    }
    public String delete(int id){
        return hdctdao.delete(id);
    }
     public List<HDCTEntity> timKiem(int ma){
        List<HDCTEntity> hd = new ArrayList<>();
        for (HDCTEntity x : hdctdao.getList()) {
            if(x.getMaHD().getMaHD() == ma){
                hd.add(x);
            }
        }
        return hd;
    }
}
