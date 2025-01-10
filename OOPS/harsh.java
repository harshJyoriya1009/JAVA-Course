class Fees{
    public String name;
    protected String emial;
    private String Password;
        
    }


class April extends Fees{
    public void pending(){
        System.out.println("Paid");
    }
        
}

class March extends April{
    public void pending(){
        System.out.println("Pending");
    }
}



public class harsh {

    public static void main(String arg[]){

      Fees account= new Fees();
      account.name="Harsh jyoriy";
      account.emial="harshjyoriya@gmail.com";

      








    }
    
}
