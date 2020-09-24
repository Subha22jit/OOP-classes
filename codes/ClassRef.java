public class ClassRef {
    static Class returnClass(Object ob) {
        if (ob.getClass() == ClassRef.class)
            System.out.println("Same Class Detected!");
        return ob.getClass();
    }

    Object getNewObject(boolean same) {
        if (same)
            return new ClassRef();
        return new TClass();
    }

    public static void main(String[] args) {
        ClassRef cr = new ClassRef();
        Object ob1 = cr.getNewObject(true);
        Object ob2 = cr.getNewObject(false);
        System.out.println("ROOT " + cr + " FROM " + cr.getClass());
        System.out.println("GEN#1 " + ob1 + " FROM " + ob1.getClass());
        System.out.println("GEN#2 " + ob2 + " FROM " + ob2.getClass());
    }
}

class TClass {

}