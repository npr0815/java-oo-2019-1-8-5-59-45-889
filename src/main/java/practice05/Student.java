package practice05;

public class Student extends Person{
    //属性
    private int klass;

    //无参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    //set、get方法
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduce = super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
        return introduce;
    }
}
