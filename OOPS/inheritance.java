//SINGLE LEVEL INHERITANCE----------------------------------------------------------------------------------------------------
class Shape{
    String color;

    public void area(){
        System.out.println("Display area");
    }
    
}


class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}

public class inheritance {
    public static void main(String arg[]){
        Triangle t1= new Triangle();
        t1.color="Red";
        
    }
    
}

//MULTI LEVEL INHERITANCE------------------------------------------------------------------------------------------------------

class Shape{
    String color;

    public void area(){
        System.out.println("Display area");
    }
    
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}

class EquilateralTriangel extends Triangle{
    Public void are(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class inheritance{
    public static void main(String arg[]){

    }
}


//HIERARCHIAL LEVEL IHERITANCE-------------------------------------------------------------------------------------------------

class Shape{
    String color;

    public void area(){
        System.out.println("Display area");
    }
    
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritance{
    public static void main(String arg[]){

    }
}

//HRBRID INHERITANCE-------------------------------------------------------------------------------------

class Shape{
    String color;

    public void area(){
        System.out.println("Display area");
    }
    
}

class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
class EquilateralTriangel extends Triangle{
    Public void are(int l, int h){
        System.out.println(1/2*l*h);
    }
}


public class inheritance{
    public static void main(String arg[]){

    }
}
