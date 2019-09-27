package Service;

import Dao.HibernateSessionFactoryUtil;
import Model.Group;
import Model.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ServiceGroup implements Service {


    @Override
    public void creatItem(Item item) {

        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(item);
            transaction.commit();
        }


    }
}
