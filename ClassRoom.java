package Wilder;

public class ClassRoom {
   public static void main(String[] args) {
    Wilder richard = new Wilder("Richard", true);
    Wilder jeanClaude = new Wilder("Jean-Claude", true);
    Wilder henri = new Wilder("Henri", false);
    System.out.println(richard.whoAmI());
    System.out.println(jeanClaude.whoAmI());
    System.out.println(henri.whoAmI());
} 

    }

   



