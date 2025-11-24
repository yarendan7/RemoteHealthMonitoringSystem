public class WearableDevice {
    private String deviceId;
    private Patient owner;

    public WearableDevice(String deviceId, Patient owner) {
        this.deviceId = deviceId;
        this.owner = owner;
    }
}