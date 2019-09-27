import Dao.HibernateSessionFactoryUtil;
import Model.Group;
import Model.Item;
import Model.Student;
import Service.ServiceGroup;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        Item group = new Group("java", "22.03.18");
        ServiceGroup sg = new ServiceGroup();
        Item student = new Student("Alex", 22);
        student.setGroup(group);
        group.addStudent(student);
        sg.creatItem(group);


    }
}
