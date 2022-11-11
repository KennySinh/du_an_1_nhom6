package repositories;

import model.HoaDonEntity;
import hibernateConfig.HibernateConfig;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HoaDonDAO {

    Session ss;

    public HoaDonDAO() {
        ss = hibernateConfig.HibernateConfig.getFACTORY().openSession();
    }

    public List<HoaDonEntity> getList() {
        List<HoaDonEntity> hoaDonEntitys;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            TypedQuery<HoaDonEntity> query = session.createQuery("from HOADON where TrangThai = 0");
            hoaDonEntitys = query.getResultList();
        }
        return hoaDonEntitys;
    }

    public List<HoaDonEntity> getListThanhToan() {
        Query query = ss.createQuery("from HOADON where TrangThai = 1");
        System.out.println(query.list().get(0));
        return query.list();
    }

    public String save(HoaDonEntity hd) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(hd);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Không thành công";
            }
        }
        return "Tạo hóa đơn thành công";
    }

    public String update(HoaDonEntity hd) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(hd);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Không thành công";
            }
        }
        return "Thanh toán hóa đơn thành công";
    }
}
