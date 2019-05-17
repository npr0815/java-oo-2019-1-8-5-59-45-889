package practice08;

public class Teacher extends Person{
    //属性
    private Klass klass;

    //无参构造方法
    public Teacher() {
    }

    //有参构造方法
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
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

        if (klass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";

        }
        return super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        if (klass.getNumber() == student.getKlass().getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
