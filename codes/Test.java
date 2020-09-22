class Test2 {
    int data;
    Test2(){
        this.data = 1;
    }
}


public class Test {
    int data;
    Test(int data){
        this.data = data;
    }
    Test(){
        this.data = 2020;
    }

    void showDetails1(Test cl){
        System.out.printf("%s - %d\n",cl,cl.data);
    }

    void showDetails2(Test2 cl){
        System.out.printf("%s - %d\n",cl,cl.data);
    }



    public static void main(String[] args) {
        Test t1 = new Test();
        Test2 t2 = new Test2();
        t1.showDetails1(t1);
        t1.showDetails2(t2);
    }
    }
