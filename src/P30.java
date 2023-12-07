class P30 {
    public static void main(String[] args) {
        Car30 car1;
        car1 = new Car30();

        try {
            car1.setCar(1234, -10);
        }

        catch (CarException e) {
            System.out.println("拋出" + e + "了");
        }

        car1.show();
    }
}

class CarException extends Exception {

}
