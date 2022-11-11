package repositories;

import model.HDCTEntity;
import hibernateConfig.HibernateConfig;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HDCTDAO {

    public List<HDCTEntity> getList() {
        List<HDCTEntity> hdcts;
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            TypedQuery<HDCTEntity> query = session.createQuery("from HOADONCHITIET");
            hdcts = query.getResultList();
        }
        return hdcts;
    }

    public String save(HDCTEntity hd) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(hd);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return "Lỗi";
            }
        }
        return "Thành công";
    }

    public String delete(int id) {
        try ( Session session = hibernateConfig.HibernateConfig.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                String sql = "DELETE HOADONCHITIET p WHERE p.ID = :id";
                Query query = session.createQuery(sql);
                query.setParameter("id", id);
                int result = query.executeUpdate();
                if (result == 0) {
                    id = 0;
                }
            } catch (Exception e) {
                e.printStackTrace();
                id = -1;
                return "Không thành công";
            }
        }
        return "Trả hàng thành công";
    }
}
