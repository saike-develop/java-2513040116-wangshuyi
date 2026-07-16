import java.util.Scanner;
public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 创建输入工具：创建一个scanner对象sc,用来接受用户输入
        int[] arr = new int[10];
        //创建数组arr，长度为10
        System.out.println("为数组元素赋值");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            //为数组arr的元素赋值，存入数组
        }
        sort(arr);
        //调用Sort.sort方法对数组arr进行排序
    }

    public static void sort(int[] arr) {
        {
            for (int i = 1; i < 10; i++) {
                //外层循环：循环次数为数组的长度减1
                for (int j = 0; j < 10 - i; j++) {
                    //内层循环：循环次数为数组的长度减去外层循环的次数，两两比较
                    if (arr[j] > arr[j + 1]) {
                        //如果当前元素arr[j]大于arr[j+1]，就交换位置
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
                showArray(arr);
                //排序完成后，调用ShowArray方法打印数组arr
            }
        }
        public static void showArray( int[] arr){
            for (int i : arr) {
                //遍历数组arr中的每个元素i
                System.out.print(i + "\t");
                //用制表符分隔每个数字
            }
            System.out.println();
        }
    }
