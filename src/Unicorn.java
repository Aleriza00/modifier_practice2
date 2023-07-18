public class Unicorn extends  Animal{
    static  void eat(){
        System.out.println("Unicorn eat :flowers");
    }
    static  void  live(){
        System.out.println("Unicorn live in: USA, China, India");
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
