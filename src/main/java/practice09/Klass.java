package practice09;

import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;

public class Klass extends Exception {
    //属性
    private int number;
    private Student leader;
    private Set<Student> member = new HashSet<>();

    //无参构造
    public Klass() {
    }

    //有参构造
    public Klass(int number) {
        this.number = number;
    }

    //set、get方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    /**
     * getDisplayName显示班级名
     *
     * @return
     */
    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        for (Student stu : member) {
            if (stu == student) {
                leader = student;
                break;
            }

        }
        System.out.print("It is not one of us.\n");

    }

    public void appendMember(Student student) {
        member.add(student);
    }
}
