import java.util.Scanner;
public class G01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double num1,num2,sum;
        System.out.println("请输入你想计算的两个数");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        System.out.println("请选择你想进行的运算方式");
        System.out.println("1.+\t\t"+"2.-\t\t\t"+"3.*\t\t\t"+"4./");
        switch ( sc.nextInt()){
            case 1:
                sum=num1+num2;
                System.out.println("输出结果为："+sum);
                break;
            case 2:
                sum=num1-num2;
                System.out.println("输出结果为："+sum);
                break;
            case 3:
                sum=num1*num2;
                System.out.println("输出结果为："+sum);
                break;
            case 4:
                sum=num1/num2;
                System.out.println("输出结果为："+sum);
                break;
        }
    }
}
