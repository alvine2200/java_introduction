class Human{
    String name="";
    int age=20;

    public void showHumanDescription(String name,int age)
    {
        System.out.printf("Name: %s \n",name);
        System.out.printf("Age: %d",age);
    }
}
public class Classes {
    public static void main(String[] args) throws Exception{
    Human human=new Human();
    human.name="Alvine Llavu";
    human.age=23;
    human.showHumanDescription(human.name, human.age);
    }
}
