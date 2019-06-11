public class sumOfDigits{
    public static void main(String[] args){
        System.out.println(sumDigitsInNumber(546));
    }
    public static int sumDigitsInNumber(int number){
        int sum = 0;
        for(int i = 1; i < 4; i++){
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}