import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建输入工具：创建一个scanner对象sc,用来接受用户输入
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        //读取用户输入的整数，赋值给变量year
        if ((year%4==0 & year%100!=0)) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
        
        sc.close();
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}