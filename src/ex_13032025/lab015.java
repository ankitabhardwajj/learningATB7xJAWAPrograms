package ex_13032025;

public class lab015 {
    public static void main(String[] args) {
        int a = 2;
        int b= 3;
        System.out.println(a+b);

        String s1 = "ankita";
        String s2 = "bhardwaj";
        System.out.println(s1+s2);

        String s3 = "ankita";
        int c = 1;
        int d = 2;
        System.out.println(c+d); // 3
        System.out.println(c+s3);// 1ankita
        System.out.println(s3+d);// ankita2
        System.out.println(c+d+s3);//3ankita
        System.out.println(s3+c+d);//ankita12
        System.out.println(c+s3+d);//1ankita2
        System.out.println(c+d+s3+d+s3+c+d);//3ankita2ankita12
    }
}
