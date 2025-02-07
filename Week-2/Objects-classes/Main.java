public class Main {
    public static void main(String[] args) {
        User user1 = new User("Allen",23);
        User user2 = new User("Allen",23);
        SecondUser user3 = new SecondUser("Allen",23);
        SecondUser user4 = new SecondUser("Allen",23);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user1.equals(user2));
        System.out.println(user3.equals(user1));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());
    }
}
