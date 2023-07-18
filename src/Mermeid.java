public class Mermeid extends Animal{
    static void homeMermeid(){
        System.out.println("Atlantida");
    }
    static  void  friends(){
        System.out.println("Fish : Flounder, Crab:Sebastian");
    }
    public Mermeid(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\''+
                '}';
    }
}
