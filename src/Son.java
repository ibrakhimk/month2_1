final class Son extends Father {
    private String sport;

    public Son(String name, int age, Body body, HobbiesMen hobbiesMen,String sport){
        super(name, age,body,hobbiesMen);
        this.sport = sport;
    }
    public String getInfo(){
        return "Name: " + getName() +
                "\nage: " + getAge() +
                "\nHair: " + getBody().getHair()+
                "\nRost: " + getBody().getRost()+
                "\nHobbies: " + getHobbiesMen()+
                "\nSport: " + sport;
    }
}
