package service;

import model.DoiTraEntity;
import repositories.DoiTraDAO;
import viewmodel.DoiTraView;
import java.util.ArrayList;
import java.util.List;
public class DoiTraService {
    DoiTraDAO doiTraDAO;

    public DoiTraService() {
        doiTraDAO = new DoiTraDAO();
    }
     public List getList(){
        return  doiTraDAO.getList();
    }
    public List getListVoHieuHoa(){
        return doiTraDAO.getListVoHieuHoa();
    }
    public String add(DoiTraView x){
        return doiTraDAO.save(new DoiTraEntity(x.getMaDTH(), x.getMaHD(), x.getNgayDTH(), x.getMoTa()));
    }
     public String edit(DoiTraView x){
        return doiTraDAO.update(new DoiTraEntity(x.getMaDTH(), x.getMaHD(), x.getNgayDTH(), x.getMoTa()));
    }
     public String voHieuHoa(DoiTraView x){
        return doiTraDAO.voHieuHoa(new DoiTraEntity(x.getMaDTH(), x.getMaHD(), x.getNgayDTH(), x.getMoTa()));
    }
     public List<DoiTraEntity> timkiem(int ma){
         List<DoiTraEntity> dt = new ArrayList<>();
         for (DoiTraEntity x : doiTraDAO.getList()) {
             if(x.getMaDTH() == ma){
                dt.add(x);
            }
         }
         return dt;
     }
}
