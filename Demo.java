class Human
{
    private int age ;
    private String name ;
    
    public int getAge()
    {return age;}

    public void setAge(int age)
    {this.age= age;}


    public String getName()
    {return name;}

    public void setName(String name)
    {this.name= name;}

}

public class Demo
{

    public static void main(String a[])
    {

        Human obj = new Human();
        obj.setAge(0);


        obj.setName("Jane");

        System.out.println(obj.getName() + " : " + obj.getAge());

        // int n = 1;

        // if (n ==1)
        //     System.out.println("Monday");
        // else if (n==2)
        //     System.out.println("Monday";);
        // System.out.println("Sunday");
        // System.out.println("Monday");
        // System.out.println("Tuesday");
        // System.out.println("Wednesday");
        // System.out.println("Thursday");
        // System.out.println("Friday");

        // String name  = new String("Joan");
        // String name = "Joan";
        // name  =  name + " Wambui";
        // System.out.println("hello" + "," + name);

        // String s1 = "Jane";
        // String s2 = "Jane";
        // System.out.println(s1 == s2);

        // StringBuffer sb = new StringBuffer("Joan");
        // sb.append(" Wambui");
        // System.out.println(sb);

        


    }
}