package codes;

public class Second {
    public static void main(String[] args) {
        Submis s = new Submis(2);
        s.show();
    }
}


class Submis{
    int x;
    Submis(int x){
        this.x=x;
    }
    void show(){
        System.out.println(this.x);
    }
}