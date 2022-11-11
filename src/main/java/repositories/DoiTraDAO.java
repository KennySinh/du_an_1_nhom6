package repositories;

import model.DoiTraEntity;
import hibernateConfig.HibernateConfig;
import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DoiTraDAO {

    public List<DoiTraEntity> getList() {
        List<DoiTraEntity> listDoiTraEntitys;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            TypedQuery<DoiTraEntity> query = session.createQuery("from DOIHANG");
            listDoiTraEntitys = query.getResultList();
        }
        return listDoiTraEntitys;
    }

    public String save(DoiTraEntity dt) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(dt);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "That bai";
            }
        }
        return "Thanh cong";
    }

    public String update(DoiTraEntity dt) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.update(dt);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "That bai";
            }
        }
        return "Thanh cong";
    }

    public List<DoiTraEntity> getListVoHieuHoa() {
        List<DoiTraEntity> doiTraEntitys;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            TypedQuery<DoiTraEntity> query = session.createQuery("from DOIHANG");
            doiTraEntitys = query.getResultList();
        }
        return doiTraEntitys;
    }
     public String voHieuHoa(DoiTraEntity dt) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.update(dt);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Không thành công";
            }
        }
        return "Vô hiệu hóa thành công";
    }
    public Date Ngaymua(String mdt) {
        Date date;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            String sql = "Select NgayTiepNhan from DOIHANG where MaDTH =: mdt";
            Query qr = session.createQuery(sql);
            qr.setParameter("mdt", mdt);
            date = (Date) qr.getSingleResult();
        }
        return date;
    }
    public Date Mota(String mdt) {
        Date mota;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            String sql = "Select MoTa from DOIHANG where MaDTH =: mdt";
            Query qr = session.createQuery(sql);
            qr.setParameter("mdt", mdt);
            mota = (Date) qr.getSingleResult();
        }
        return mota;
    }
    public String Manv(String mdt) {
        String mnv;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            String sql = "Select MaNV from DOIHANG where MaDTH =: mdt";
            Query qr = session.createQuery(sql);
            qr.setParameter("mdt", mdt);
            mnv = (String) qr.getSingleResult();
        }
        return mnv;
    }
}
