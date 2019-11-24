abstract  class Shape {
    private String color;

    public Shape(){}
    public Shape(String color)
    {
        this.color = color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || this.getClass() == obj.getClass()) return  true ;
        return false;
    }

    public abstract double getPerimeter();  //返回图形的周长
    public abstract double getArea();       //返回图形的周长
    public abstract void move(int x,int y);            //移动图形:在横轴和纵轴分别移动x，y
}
class Ponit {
    double x ;
    double y ;
    Ponit () {
        x= 0 ;
        y = 0;
    }
    Ponit(double x , double y ){
        this.x = x;
        this.y = y ;
    }
    public static  double distance (Ponit p1  , Ponit p2 ) {
        return Math.sqrt ((p1.x - p2.x ) *(p1.x - p2.x ) + (p1.y - p2.y) * (p1.y - p2.y) );
    }
    public void move (int x, int y ) {
        this.x += x  ;
        this.y += y;
    }
    public String toString () {
        String res= "("+x+","+y+")";
        System.out.println(res);
        return res ;
    }
    public boolean samePoint (Ponit t ) {
        return this.x == t.x && this.y==t.y ;
    }
}

class  Circle extends  Shape{
    double r ;
    Ponit  p ;
    Circle (double r , Ponit p ) {
        this.r =r ;
        this.p = p ;
    }
    @Override
    public double getPerimeter() {
        double res = 2 * Math.PI * r ;
        System.out.println("周长为:"+res);
        return res;
    }

    @Override
    public double getArea() {
        double res = Math.PI * r * r ;
        System.out.println("面积为:"+res);
        return res;
    }

    @Override
    public void move(int x, int y) {
        p.move(x,y);
    }

    @Override
    public String toString() {
        return "我是圆心为"+p.toString()+"半径为"+r+"的圆";
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag =  super.equals(obj);
        if (flag){
            Circle c = (Circle) obj;
            if (c.r != this.r || !this.p.samePoint(c.p)){
                flag =false ;
            }
        }
        return flag ;
    }
}
class  Triangle extends Shape {
    Ponit p1;
    Ponit p2;
    Ponit p3;

    public Triangle(Ponit p1, Ponit p2, Ponit p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getPerimeter() {
        double res =Ponit.distance(p1, p2) + Ponit.distance(p1,p3) + Ponit.distance(p2,p3);
        System.out.println("周长为:"+res);
        return  res;
    }

    @Override
    public double getArea() {
        double res ;
        double a =  Ponit.distance(p1, p2) ;
        double b = Ponit.distance(p1,p3) ;
        double c =  Ponit.distance(p2,p3);
        double p = (a +b +c ) /2 ;
        res = Math.sqrt(p * (p-a) *  (p-b) * (p -c )) ;
        System.out.println("面积为:"+res);
        return res ;
    }

    @Override
    public void move(int x, int y) {
        p1.move(x,y);
        p2.move(x,y);
        p3.move(x,y);
    }
    @Override
    public boolean equals(Object obj) {
        boolean flag =  super.equals(obj);
        if (flag){
            Triangle c = (Triangle) obj;
            if (!this.p1.samePoint(c.p1) || !this.p2.samePoint(c.p2)|| !this.p3.samePoint(c.p3)){
                flag =false ;
            }
        }
        return flag ;
    }
    @Override
    public String toString() {
        return "我是顶点为"+p1.toString()+","+p2.toString()+","+p3.toString()+"的三角形";
    }
}
class  Rectangle  extends Shape  {

    Ponit p1 ;
    Ponit p2 ;
    Rectangle (Ponit p1 , Ponit p2 ) {
        this.p1 = p1 ;
        this.p2 = p2 ;
    }
    @Override
    public double getPerimeter() {
        double res =  2*(Math.abs(p1 .x - p2.x) + Math.abs(p1 .y - p2.y) );
        System.out.println("周长为:"+res);
        return  res ;
    }

    @Override
    public  double getArea() {
        double res =(Math.abs(p1 .x - p2.x) * Math.abs(p1 .y - p2.y));
        System.out.println("面积为:"+res);
        return res ;
    }

    @Override
    public String toString() {
        return "我是对角顶点为"+p1.toString() + ","+p2.toString() +"的长方形";
    }

    @Override
    public void move(int x, int y) {
        p1.move(x,y);
        p2.move(x,y);
    }
    @Override
    public boolean equals(Object obj) {
        boolean flag =  super.equals(obj);
        if (flag){
            Rectangle c = (Rectangle) obj;
            if (!this.p1.samePoint(c.p1) || !this.p2.samePoint(c.p2)){
                flag =false ;
            }
        }
        return flag ;
    }
}