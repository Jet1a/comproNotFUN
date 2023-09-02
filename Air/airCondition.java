import org.w3c.dom.ls.LSOutput;

public class airCondition {
    private int MIN_TEMPERATURE = 20;
    private int MAX_TEMPERATURE = 30;
    private int MIN_FAN_SPEED = 0;
    private int MAX_FAN_SPEED = 2;
    private boolean airOn;
    private boolean fanOn;
    private int targetTemperature;
    private int fanSpeed;

    public airCondition(int targetTemperature, int fanSpeed) {
        this.targetTemperature = targetTemperature;
        this.fanSpeed = fanSpeed;
    }

    public boolean isAirOn() {
        return airOn;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void turnAirOnOff() {
        if (airOn && fanOn) {
            airOn = false;
            fanOn = false;
        } else {
            airOn = true;
            fanOn = true;
        }
    }

    public void increaseTemperature() {
        targetTemperature++;
        if (targetTemperature > MAX_TEMPERATURE) {
            targetTemperature = 30;
        } else if (targetTemperature < MIN_TEMPERATURE) {
            targetTemperature = 20;
        }
    }

    public void decreaseTemperature() {
        targetTemperature++;
        if (targetTemperature < MIN_TEMPERATURE) {
            targetTemperature = 20;
        }
    }

    public void changeFanSpeed() {
        fanSpeed++;
        if (fanSpeed > MAX_FAN_SPEED) {
            fanSpeed = MIN_FAN_SPEED;
        }
    }

    @Override
    public String toString() {
        if (airOn) {
            return "Air Conditioner {Status: on , Temp: " + targetTemperature + ", Fan: " + fanSpeed + "}";
        } else {
            return "Air Conditioner {Status: off}";
        }
    }
}



