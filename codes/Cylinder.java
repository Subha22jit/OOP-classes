import java.lang.Math;

public class Cylinder {
    double radius;
    double height; 
    Cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }

    double getSurfaceArea(){
        return ((2*Math.PI*Math.pow(this.radius,2)) + (2*Math.PI*this.radius*this.height));
    }

    double getVolume(){
        return Math.PI*Math.pow(this.radius,2)*this.height;
    }

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please include parameters in the format: radius height");
            System.exit(0);
        }
        Cylinder c = new Cylinder(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.printf("Surface Area: %.2f\nVolume: %.2f",c.getSurfaceArea(),c.getVolume());
    }

    
}
