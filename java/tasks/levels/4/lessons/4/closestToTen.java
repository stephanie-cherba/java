//Write the displayClosestToTen method. The method should display the argument that is nearest to 10.
// For example, given the numbers 8 and 11, 11 is closest to ten. If both numbers are equally close to 10, then display either of them.


public class closestToTen {
    public static void main(String[] args){
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b){
        int c = abs(a);
        int d = abs(b);
        if(c > d){
            System.out.println(d);
        }else if(d > c){
            System.out.println(c);
        } else if(c == d){
            System.out.println(c);
        }
    }

    public static int abs (int a){
        if(a < 0){
            return -a;
        } else {
            return a;
        }
    }
}