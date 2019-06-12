
//Write code in the addNewCat method to increase the number of cats by 1 each time it is called.
// The variable catCount corresponds to the number of cats.

public class catRegister{
    private static int catCount = 0;

    public static void addNewCat(){
        catCount++;

    }
    public static void main(String[] args){
        addNewCat();
        System.out.println(catCount);
    }
}