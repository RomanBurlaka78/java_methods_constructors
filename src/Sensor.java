public class Sensor {
    private String name;
    private int serialNumber;
    private double currentTemperature;
    private boolean active;
    private String info;

    public Sensor(String name, int serialNumber, double currentTemperature, boolean active, String info) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.currentTemperature = currentTemperature;
        this.active = active;
        this.info = info;
    }

    public Sensor(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.currentTemperature =0;
        this.info = null;
        this.active =false;

    }
    public Sensor(String info) {
        this.info = info;
//        this.name = null;
//        this.serialNumber = 0;
//        this.currentTemperature = 0;
//        this.active = false;

    }
    public Sensor() {
        this.name = "Test";
        this.serialNumber = 0;
        this.currentTemperature = 0;
        this.info ="To tylko test";
        this.active =false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double convertToF(double currentTemperature) {
        currentTemperature = currentTemperature * 9/5 + 32 ;
        System.out.println(currentTemperature);

        return currentTemperature;
    }
    public  double convertToK(double currentTemperature) {

        System.out.println(currentTemperature);

        return currentTemperature + 273.15;
    }

    public   double temp() {
        if(currentTemperature>50) {
            System.out.println("Wysoka");
        }
        else if (currentTemperature>30 && currentTemperature<49.9) {
            System.out.println("Srednia");
        }

        else if (currentTemperature>=20 && currentTemperature<=29.9) {
            System.out.println("Norma");
        }
        else if (currentTemperature<20) {
            System.out.println("Niska");
        }
        return currentTemperature;


    }


}
