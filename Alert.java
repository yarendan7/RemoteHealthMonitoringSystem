public class Alert {
    private String alertId;
    private Patient patient;
    private VitalSignRecord vitals;
    private String message;
    private boolean resolved;

    public Alert(String alertId, Patient p, VitalSignRecord v, String msg) {
        this.alertId = alertId;
        this.patient = p;
        this.vitals = v;
        this.message = msg;
        this.resolved = false;
    }
}