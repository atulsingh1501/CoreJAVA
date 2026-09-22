package OOPs.constructorsOverloading;

public class main {
    public static void main(String[] args) {
    //Overloaded Constructor = Allow a class to have a multiple constructors with different parameter lists.
    //enable object to initialize in a various ways

        user user1 = new user("Spiderman");
        user user2 = new user("peterparker","peter@gmail.com");
        user user3 = new user("miles morlies","miles@gmail.com",20);
        user user4 = new user();

        System.out.println("this is a data of user1");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println("this is a data of user2");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println("this is a data of user3");
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println("this is a data of user4");
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }

}
