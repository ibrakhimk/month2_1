public class Father extends Ded{
    private String name;
    private int age;

    public Father( String name ,int age, Body body, HobbiesMen hobbiesMen){
        this.age = age;
        this.name = name;
        super.setBody(body);
        super.setHobbiesMen(hobbiesMen);
    }
    public String getInfo(){
        return "age: " + getAge() +
                "\nName: " + getName() +
                "\nHair: " + getBody().getHair()+
                "\nRost: " + getBody().getRost()+
                "\nHobbies: " + getHobbiesMen();
    }
    public void hairs(){
        System.out.println("Color hair: BLACK");
    }
    public int hairs(String hairs){
        System.out.println("hair men: "+ hairs);
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
