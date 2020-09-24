package codes;

public class First {
    int x;
    First(int x){
        this.x=x;
    }
    void show(){
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        First f = new First(1);
        f.show();
    }
}
