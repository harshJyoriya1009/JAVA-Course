/*
     polymorphism ==> one entity many type.
     Example:- printInfo(there has many printInfo in lower code).
 */

class Student{
    String name;
    int age;

    public void printInfo(String name){
       System.out.println(name); 
    }
    public void printInfo(int age){
        System.out.println(age); 
     }
     public void printInfo(String name, int age){
        System.out.println(name+" "+ age); 
     }
}

class polymorphism{
    public static void main(String arg[]){
        Student s1=new Student();

        s1.name="Harsh";
        s1.age=15;

        s1.printInfo(s1.name, s1.age);

    }
}