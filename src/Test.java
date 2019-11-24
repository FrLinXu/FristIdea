public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(1.0 , new Ponit(0,0)) ;
        System.out.println(c.toString());
        c.getArea() ;
        c.getPerimeter();
        c.move(1,1);
        c.p.toString();
        Triangle t = new Triangle(new Ponit (0,0) , new Ponit(0,1) , new Ponit(1,1)) ;
        System.out.println(t.toString());
        t.getArea();
        t.getPerimeter();
        Rectangle r = new Rectangle (new Ponit(0,0) , new Ponit(1,1)) ;
        System.out.println(r.toString());
        r.getArea();
        r.getPerimeter();

    }
}

