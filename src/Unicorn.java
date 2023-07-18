public class Unicorn extends  Animal{
    static  void eat(){
        System.out.println("flowers");
    }
    static  void  live(){
        System.out.println("USA, China, India");
    }

    public Unicorn(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
