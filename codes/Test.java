
public class Test {
    int data;
    Test(int data){
        this.data = data;
    }
    Test(){
        this.data = 2020;
    }

    static void showDetails(Object cl){
        System.out.printf(":%s - %s\n",cl,cl.getClass());
        if(cl.getClass().equals(Test.class))
            System.out.println("Same Class");
    }



    public static void main(String[] args) {
        Test t1 = new Test();
        Test2 t2 = new Test2();
        showDetails(t1);
        showDetails(t2);
    }
    }

    class Test2 {
        int data;
        Test2(){
            this.data = 1;
        }
    }
    