package medium.Exercise03;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "华为";

        p.price = 5999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand="苹果";
        p.price=9999;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.play();

    }
}
