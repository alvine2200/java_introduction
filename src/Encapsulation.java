class Animal
{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Encapsulation {

    public static void main(String[] args)
    {
        Animal animal=new Animal();
        animal.setAge(23);
        animal.setName("Shushu Heidi");
        System.out.printf("%s : %s",animal.getName(),animal.getAge());
    }
}
