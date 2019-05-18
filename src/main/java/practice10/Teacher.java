package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    //属性
    private LinkedList<Klass> classes = new LinkedList<Klass>();


    //无参构造方法
    public Teacher() {
    }

    //有参构造方法
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList classes) {
        super(id, name, age);
        this.classes = classes;
    }

    //set、get方法
    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String str = "";
        if (classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        for (int i = 0; i < classes.size() - 1; i++) {
            str = Integer.toString(classes.get(i).getNumber());
            str += ", ";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + str + classes.get(classes.size() - 1).getNumber() + ".";
    }

    /**
     * 只要学生在classes中的任一个klass中，就是在教他
     *
     * @param student
     * @return
     */
    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        for (Klass klass : classes) {
            if (klass.getNumber() == student.getKlass().getNumber()) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}