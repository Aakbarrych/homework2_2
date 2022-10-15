public class Road {
    public static void main(String[] args) {


        BMW bmw = new BMW();
        Mersedes mersedes = new Mersedes();
        bmw.setSoundDrive("drive");
        mersedes.setSoundDrive("drive");
        gd(mersedes);
        gd(bmw);
        bmw.setNewSound("driveeee");
        mersedes.setNewSound("driveeee");
        newSound(mersedes);
        newSound(bmw);


    }
    public static void gd(Car car) {
        car.drive();
    }
    public static void newSound(Car car){
        car.getNewSound();
    }



}
