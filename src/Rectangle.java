/**
 * Created by Semen on 08.12.2016.
 */
public class Rectangle extends User {

    Rectangle(){
        super.a=10;
        super.b=15;
    }

    public void plosha(){
        double d=super.a*super.b;
        System.out.println("Площадь прямоугольника="+d);

    }
}
