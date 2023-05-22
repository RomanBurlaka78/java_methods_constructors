public class Cars {
    private String brand;
    private String color;
    private String model;
    private int maxSpeed;
    private int currentSpeed;


    public int getCurrentSpeed() {
        return  currentSpeed;
    }

    public void increaseSpeed(int x) {
        if(maxSpeed>100) {
            currentSpeed = currentSpeed +10;
        }

    }

    public int getRok() {
        return rok;
    }


    public void setRok(int rok) {
        this.rok = rok;
    }

    private int  rok;
    private boolean isTurnOn;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean turnOn) {
        isTurnOn = turnOn;
    }
}
