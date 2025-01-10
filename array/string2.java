public class string2 {
    public static void main(String arg[]){
        String firstname= "Harsh" ;
        String lastname= "Jyoriya" ;
        String fullName= firstname + lastname;
        
        //charAt --> It basically give output of your input in one by one word.
        /*
         * for example--The output of this code
             H
             a
             r
             s
             h
             j
             y
             ...so on
         */
        for(int i=0 ; i<fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
        }
    }
    
}
