import java.util.Scanner;
//引入一个叫scanner的工具，用来读取用户的键盘输入
public class Exercise03 {
    public static void main (String[] args){
        double height = 10;
        System.out.println("请输入反弹次数：");
        Scanner sc = new Scanner(System.in);
        //创建输入工具：创建一个scanner对象sc,用来接受用户输入
        double n = sc.nextInt();
        //读取用户输入的整数，赋值给变量n
        for (int i = 1; i <= n; i++){
            height/=2;
            if (height==0){
                break;
            }
        }
        System.out.println("第"+n+"次反弹后，球高度为："+height);

    }
}
