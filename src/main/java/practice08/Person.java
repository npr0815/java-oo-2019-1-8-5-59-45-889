package practice08;

public class Person {
    //属性
    private  int id;
    private String name;
    private int age;

    //无参构造方法
    public Person() {
    }

    //构造方法
    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //set、get方法
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

    /**
     * introduce方法返回一个字符串形如：
     * My name is Tom. I am 21 years old.
     *
     * @return String
     */
    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
