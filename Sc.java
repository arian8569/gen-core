public class Sc {

    public void ko(String a) {
        System.out.println("Hello" + a);

    }


    public void ch(int age) {

        if (age < 13) {
            System.out.println("you are gen alpha");

        } else if (age >= 13 && age < 29) {
            System.out.println("You are gen Z");

        } else if (age >= 29 && age < 45) {
            System.out.println("You are gen Y ");

        } else if (age >= 45 && age < 60) {
            System.out.println("You are gen X");

        } else if (age >= 60 && age < 88) {
            System.out.println("You are gen Baby Boomers");

        } else if (age >= 88 && age < 120) {
            System.out.println("You are The Silent Generation");

        } else {
            System.out.println("you are a lier");
        }

    }
}