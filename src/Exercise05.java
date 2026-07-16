import java.util.Scanner;

public class Exercise05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个成绩:");
        int grade = sc.nextInt();
        switch (grade){
            case 90:
                System.out.println("优秀");
                break;
            case 80:
                System.out.println("良好");
                break;
            case 70:
                case 60:
                System.out.println("及格");
                break;
            case 50:
            case 40:
            case 30:
            case 20:
            case 10:
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        //关闭扫描器,防止资源泄露
        sc.close();
    }
}