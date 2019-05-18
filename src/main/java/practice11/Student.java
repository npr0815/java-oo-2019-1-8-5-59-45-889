package practice11;

public class Student extends Person{
    //属性
    private Klass klass;

    //无参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
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
//        if (super.getId() == klass.getLeader().getId()) {
//            return super.introduce() + " I am a Student. I am Leader of " + this.klass.getDisplayName() + ".";
//        }
        return super.introduce() + " I am a Student. I am at " + this.klass.getDisplayName() + ".";
    }
}
