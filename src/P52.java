public class P52 {
    public static void main(String[] args) {
        Company52 cmp = new Company52();
        Driver52 drv1 = new Driver52(cmp);
        drv1.start();

        Driver52 drv2 = new Driver52(cmp);
        drv2.start();
    }
}

class Company52 {
    private int sum = 0;

    public void add(int a) {
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");
        System.out.println("賺到" + a + "元了。");
        tmp += a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}

class Driver52 extends Thread {
    private Company52 comp;

    public Driver52(Company52 c) {
        comp = c;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            comp.add(50);
        }
    }
}
