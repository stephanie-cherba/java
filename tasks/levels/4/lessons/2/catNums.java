//Write the setCatCount method. The method must set the number of cats (catCount).

public class catNums{
    private static int catCount = 0;
    
    public static void setCatCount(int catCount){
        catNums.catCount = catCount;
    }

    public static void main(String[] args){
        setCatCount(5);
        System.out.println(catCount);
    }
}