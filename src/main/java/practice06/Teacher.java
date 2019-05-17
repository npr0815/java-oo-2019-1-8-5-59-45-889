package practice06;

public class Teacher extends Person {
    //属性
    private int klass;

    //无参构造方法
    public Teacher() {
    }

    //有参构造方法
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
        String introduce;
        if (this.getKlass() == 0) {
            introduce = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            introduce = super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        }
        return introduce;
    }
}
