//Write code to correctly count the number of cats created (count) and display the correct number of cats on the screen.

public class Solution {
    public static void main (String[] args){
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}