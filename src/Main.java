public class Main {
    public static void main(String[] args) {

        Body body = new Body("BLACK","Высокий");
        Father father = new Father("55",66,body,HobbiesMen.BOX);
        System.out.println(father.getInfo());
        father.hairs();
        father.hairs("black");
        System.out.println();

        Body body1 = new Body("WHITE","154");
        Son son = new Son("Ben",14,body1,HobbiesMen.MMA,"football");
        System.out.println(son.getInfo());
        son.hairs();
        son.hairs("Он рыжий");
        System.out.println();

        Body body2 = new Body("WHITE","154");
        Son son1 = new Son("Ben",17,body1,HobbiesMen.FOOTBALL,"BOX");
        System.out.println(son.getInfo());
        son1.hairs();
        son1.hairs("WHITE");
        System.out.println();
    }
}