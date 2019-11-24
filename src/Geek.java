import java.util.ArrayList;
import java.util.Scanner;

public class Geek {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in) ;
        double PI = Math.PI ; //圆周率
        System.out.print("输入醉汉的步数:");
        int loop = in.nextInt() ;  // 循环次数
        double sum_r  = 0  ; // 总走过的距离
        double now_x = 0 ;
        double now_y = 0;
        for (int i = 0 ; i< loop ; i++) {
            double dir = Math.random() * 2 * PI ; // 与x轴的夹角
            double r = Math.random() * 1.5;  //步长
            double x = r * Math.cos(dir);
            double y = r * Math.sin(dir);
            now_x += x;
            now_y += y;
            System.out.println("("+now_x+","+now_y+")");
            sum_r += r ;
        }
        double now_r = Math.sqrt(now_x*now_x + now_y* now_y ); // 距离计算公式
        double rt = now_r/sum_r ; //效率
        System.out.println(rt);
    }
}




