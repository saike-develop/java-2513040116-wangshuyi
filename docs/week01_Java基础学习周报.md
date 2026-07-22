一、Java简介
Java是一种高级，面向对象的语言，具有“一次编写，到处运行”的特性
1.1Java的主要特点：
·跨平台性：一次编写，到处运行是 ，通过 Java 虚拟机（JVM）实现
·面向对象：完全面向对象，支持封装、继承和多态
·健壮性：强类型检查、自动内存管理（垃圾回收）、异常处理机制
·安全性：提供安全管理机制，适合网络环境
·多线程：内置多线程支持
·动态性：支持运行时加载类和反射机制
1.2Java的运行环境
JVM 作用：Java 虚拟机，负责运行字节码
JRE 作用：Java 运行环境，包含 JVM 和 Java 的类库
JDK 作用：Java 开发工具包，包含 JRE +编译工具
1.3简单程序代码解析
public class HelloWorld {//定义一个公共类，类名必须与文件名一致
public static void main(String[] args) {//程序入口
System.out.println("Hello, World!");//向控制台输出内容并换行
}
}
二、Java基础语法
2.1数据类型
2.1.1基本数据类型
byte：8位有符号整数  short：16位有符号整数  int：32位有符号整数  long：64位有符号整数
float：单精度浮点数  double：双精度浮点数
char：16位无符号字符  boolean：布尔值 范围：true、false
2.1.2引用数据类型
类（Class）：如 String、Scanner、自定义类
接口（Interface）：如 List、Runnable
数组（Array）：如 int[]、String[]
2.2变量与常量
命名规范
变量名：小驼峰，如 studentName、maxValue
常量名：全大写 + 下划线，如 MAX_SIZE、PI
类名：大驼峰，如 Student、HelloWorld
2.3运算符
2.3.1算数运算符
+：加法  -：减法  *：乘法  /：除法  %：取余数
注意
i++（后置自增）先使用变量值，再自增；++i（前置自增）先自增，再使用变量值。
2.3.2关系运算符
 ：大于  <：小于  >=：大于等于  <=：小于等于  ==：等于  !=：不等于
2.3.3逻辑运算符
&&：逻辑与  ||：逻辑或  !：逻辑非
三、流程控制
3.1选择结构
3.1.1if语句
if (条件1) {
    // 条件1为 true
} else if (条件2) {
    // 条件2为 true
} else {
    // 以上都不满足
}
3.1.2switch语句
int day = 3;
switch (day) {
    case 1:
        System.out.println("星期一");
        break;
    case 2:
        System.out.println("星期二");
        break;
    case 3:
        System.out.println("星期三");
        break;
default:
        System.out.println("其他");
}
3.2选择结构
3.2.1for循环
// 基本 for 循环
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}

// 增强 for 循环（遍历数组或集合）
int[] nums = {1, 2, 3, 4, 5};
for (int n : nums) {
    System.out.println(n);
}
3.2.2while循环
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
3.2.3do...while循环
int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);
四、数组
4.1一维数组
4.1.1声明与初始化
// 方式一：声明并分配空间
int[] arr1 = new int[5];  // 5个元素，默认值都是 0 
// 方式二：声明并直接初始化
int[] arr2 = {1, 2, 3, 4, 5};
// 方式三：先声明，后初始化
int[] arr3;
arr3 = new int[]{1, 2, 3};
4.1.2 数组的基本操作
int[] arr = {10, 20, 30, 40, 50};
// 获取数组长度
System.out.println(arr.length);  // 5
// 访问元素（索引从 0 开始）
System.out.println(arr[0]);  // 10
System.out.println(arr[4]);  // 50
// 修改元素
arr[1] = 25;
// 遍历数组
for (int i = 0; i < arr.length; i++) {
    System.out.println("arr[" + i + "] = " + arr[i]);
}
// 增强 for 循环遍历
for (int num : arr) {
    System.out.println(num);
4.2二维数组
// 声明与初始化
int[][] matrix = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
// 访问元素
System.out.println(matrix[0][0]);  // 1
System.out.println(matrix[1][2]);  // 6
// 遍历二维数组
for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < matrix[i].length; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
4.3 数组常用操作
import java.util.Arrays;
int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
// 排序
Arrays.sort(arr);
// arr = [1, 1, 2, 3, 4, 5, 6, 9]
// 二分查找（数组必须先排序）
int index = Arrays.binarySearch(arr, 5);  // 返回 5 的索引
// 填充数组
int[] nums = new int[5];
Arrays.fill(nums, 100);  // [100, 100, 100, 100, 100]
// 复制数组
int[] copy = Arrays.copyOf(arr, arr.length);
// 转换为字符串
System.out.println(Arrays.toString(arr));  // [1, 1, 2, 3, 4, 5, 6, 9]
