package Model;

import javax.persistence.*;
import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Inheritance
@Entity
@Table(name = "groups")
public class Group extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;
    @Column(nullable = false, unique = false)
    private String name;
    @Column(nullable = false, unique = false)
    private String date;

    //  @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,orphanRemoval = true,targetEntity = Student.class)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Student.class)

    private List<Item> students;

    public Group() {
    }

    @Override
    public void setGroup(Item group) {

    }

    public Group(String name, String date) {
        this.name = name;
        this.date = date;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //  public List<Student> getStudents() {
    /*    return students;
    }*/


    public void addStudent(Item student) {

        student.setGroup(this);
        students.add(student);
    }

   /* public void removeStudent(Student student)
    {
        students.remove(student);
    }*/

   /* @Override
    public String toString() {*/
      /*  return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", students=" + students +
                '}';
    }*/
}
