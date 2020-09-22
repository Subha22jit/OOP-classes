/*
Create a Class Animal then within the class create 3 objects of animals having names A1, A2 and A3, where A1 and A3 will point to the same object.
Then Display the object name.

*/
public class ClassedQuestion1 {
    public static void main(String[] args) {
        Animal A1, A2, A3;
        A1 = new Animal("A1");
        A2 = new Animal("A2");
        A3 = A1;
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
    }

}

class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
}