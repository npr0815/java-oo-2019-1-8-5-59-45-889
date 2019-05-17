package practice07;

public class Student extends Person{
    //属性
    private Klass klass;

    //无参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    //set、get方法
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }
}
