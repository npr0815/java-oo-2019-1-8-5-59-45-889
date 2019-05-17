package practice04;

public class Worker extends Person{
    //构造方法
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String introduce = super.basicIntroduce() + " I am a Worker. I have a job.";
        return introduce;
    }
}
