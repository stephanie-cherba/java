//Write the compare(int a) method so that it:
// - displays "The number is less than 5" if the method argument is less than 5,
// - displays "The number is greater than 5" if the method argument is greater than 5,
// - displays "The number is equal to 5" if the method argument is equal to 5.


public class goodOrBad {
    public static void main(String[] args){
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare (int a){
        if(a < 5){
            System.out.println("The number is less than 5");
        } else if(a > 5){
            System.out.println("The number is greater than 5");
        } else if (a == 5){
            System.out.println("The number is equal to 5");
        }
    }
}