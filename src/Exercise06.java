public class Exercise06 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
            {
                arr[i]/=2;
            }
            else
            {
                arr[i]*=2;
            }
        }
        //遍历数组arr中的每个整数元素j
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
