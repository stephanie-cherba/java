//Implement the getFeetFromInches(int inches) method. The method takes the number of inches. Your task is to make the method return the number of full feet represented by the variable inches. (1 feet = 12 in).

public class moreConversations{
    public static void main(String[] args){
        System.out.println(getFeetFromInches(28));
    }
    public static int getFeetFromInches(int inches){
        return (inches / 12);
    }
}