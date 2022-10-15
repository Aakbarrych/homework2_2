public class BMW extends Car{
    private String drive;
    private String newSound;
    private String soundDrive;

    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getSoundDrive() {
        return soundDrive;
    }

    public void setSoundDrive(String soundDrive) {
        this.soundDrive = soundDrive;
    }


    public String driveSound() {
        return soundDrive;
    }


    @Override
    public void drive(){
        System.out.println(soundDrive);

    }

    @Override
    public String getNewSound() {
        System.out.println(newSound);
        return null;
    }

}
