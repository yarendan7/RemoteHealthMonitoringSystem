public class Patient {
    private String patientId;
    private String name;
    private String condition;
    private Doctor assignedDoctor;

    public Patient(String patientId, String name, String condition, Doctor assignedDoctor) {
        this.patientId = patientId;
        this.name = name;
        this.condition = condition;
        this.assignedDoctor = assignedDoctor;
    }
}