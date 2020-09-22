import java.lang.Math;

public class Cone {
    double radius;
    double height; 
    Cone(int radius, int height){
        this.radius=radius;
        this.height=height;
    }

    double getSurfaceArea(){
        return ((Math.PI*radius*Math.sqrt(Math.pow(radius,2) + Math.pow(height,2)))+(Math.PI*radius*radius));
    }

    double getVolume(){
        return (Math.PI*Math.pow(radius,2)*height/3);
    }

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please include parameters in the format: radius height");
            System.exit(0);
        }
        Cone c = new Cone(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.printf("Surface Area: %.2f\nVolume: %.2f",c.getSurfaceArea(),c.getVolume());
    }

    
}
