package medium.Exercise01;

public class test {
    public static void main(String[] args) {
        //创建对象，记录第一只小狗的信息
        //格式：类名 对象名 = new 类名();
        // 创建对象，管理第一只小狗的信息
        Dog dog1 = new Dog();
        dog1.name = "小王";
        dog1.age = 3;
        dog1.sex = "公";
        dog1.color = "黑色";
        System.out.println("第一只小狗的信息：");
        System.out.println("名字：" + dog1.name);
        System.out.println("年龄：" + dog1.age);
        System.out.println("性别：" + dog1.sex);
        System.out.println("颜色：" + dog1.color);
        //创建对象，记录第二只小狗的信息
        Dog dog2 = new Dog();
        dog2.name = "小李";
        dog2.age = 2;
        dog2.sex = "母";
        dog2.color = "白色";
        System.out.println("第二只小狗的信息：");
        System.out.println("名字：" + dog2.name);
        System.out.println("年龄：" + dog2.age);
        System.out.println("性别：" + dog2.sex);
        System.out.println("颜色：" + dog2.color);


    }
}
