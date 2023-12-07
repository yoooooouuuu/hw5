class P45 {
    public static void main(String[] args) {
        Car45 car1 = new Car45("一號車");
        car1.start();

        Car45 car2 = new Car45("二號車");
        car2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class Car45 extends Thread {
    private String name;

    public Car45(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
