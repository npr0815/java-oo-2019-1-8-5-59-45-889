package practice07;

public class Teacher extends Person{
    //属性
    private Klass klass;

    //无参构造方法
    public Teacher() {
    }

    //有参构造方法
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }
    }

    public String introduceWith(Student student) {
        if (klass.getNumber() == student.getKlass().getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
