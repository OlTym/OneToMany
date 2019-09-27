package Model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;


@Inheritance

public abstract class Item {

    public abstract void setGroup(Item group);

    public abstract void addStudent(Item student);
}
