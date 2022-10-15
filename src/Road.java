public class Road {
    public static void main(String[] args) {


        BMW bmw = new BMW();
        Mersedes mersedes = new Mersedes();
        CarRepoImpl carRepolmpl = new CarRepoImpl();
        bmw.setSoundDrive("drive");
        mersedes.setSoundDrive("drive");
        gd(mersedes);
        gd(bmw);

        bmw.setNewSound("driveeee");
        mersedes.setNewSound("driveeee");
        carRepolmpl.newSound(mersedes);
        carRepolmpl.newSound(bmw);


    }
    public static void gd(Car car) {
        car.drive();
    }
    public static void newSound(Car car){
        car.getNewSound();
    }



}
