package Dao;


import Model.Group;
import Model.Item;
import Model.Student;
import org.hibernate.Session;

import java.util.List;

public class GroupDao implements ItemDao {

    private Session session;

    public GroupDao(Session session) {
        this.session = session;
    }

    @Override
    public void creat(Item item) {
        session.save(item);

    }

    @Override
    public void delete(Item item) {

    }

    @Override
    public void update(Item item) {

    }
}
