package practice07;

public class Klass {
    //属性
    private int number;

    //无参构造
    public Klass() {
    }

    //有参构造
    public Klass(int number) {
        this.number = number;
    }

    ////set、get方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getDisplayName显示班级名
     * @return
     */
    public String getDisplayName() {
        return "Class " + number;
    }
}
