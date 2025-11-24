import java.time.LocalDateTime;
public class VitalSignRecord {
    private double heartRate;
    private double systolicBloodPressure;
    private double diastolicBloodPressure;
    private double temperature;
    private LocalDateTime timestamp;

    public VitalSignRecord(double hr, double sys, double dia, double temp) {
        heartRate = hr;
        systolicBloodPressure = sys;
        diastolicBloodPressure = dia;
        temperature = temp;
        timestamp = LocalDateTime.now();
    }
}