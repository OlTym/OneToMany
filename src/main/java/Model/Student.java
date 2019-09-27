package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Inheritance
@Entity
@Table(name = "students")
public class Student extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int id;

    @Column(nullable = false, unique = false)
    private String name;
    @Column(nullable = false, unique = false)
    private int age;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Group.class)
    @JoinColumn(name = "group_id", nullable = false)
    private Item group;

    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        group = new Group();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }

    @Override
    public void setGroup(Item group) {
        this.group = group;
    }

    @Override
    public void addStudent(Item student) {

    }


    public Item getGroup() {
        return group;
    }


}
