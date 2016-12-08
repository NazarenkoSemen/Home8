/**
 * Created by Semen on 08.12.2016.
 */
public class Circle extends User{

    Circle(){
        super.r=8;
    }
    public void plosha(){
        double d=2*3.14*r;
        System.out.println("Площадь круга="+d);

    }
}
