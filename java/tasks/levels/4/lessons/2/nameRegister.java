//Finish writing the code of the setName method so that it sets the value of private String fullName to the value of the local String variable fullName.

public class nameRegister{
    private String fullName;
    
    public void setName(String firstName, String lastName){
        String fullName = firstName + lastName;
        this.fullName = fullName;
        System.out.println(this.fullName);

    }

    public static void main(String[] args){
        nameRegister name = new nameRegister();
        name.setName("Stephanie", "Lane");
    }
}