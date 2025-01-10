class bank{
    public String name;
    protected String email;
    private String password;

    //getters & setters

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    } 
}

public class account{
    public static void main(String arg[]){

        bank account1=new bank();
        account1.name="Harsh";
        account1.email="harshjyoriya@gmail.com";
        account1.setPassword("abcd");

        System.out.println(account1.getPassword());



    }
}