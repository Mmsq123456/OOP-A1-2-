public class Appointment {
    private String patientName;
    private String phoneNumber;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // 默认构造函数
    public Appointment() {}

    // 第二个构造函数
    public Appointment(String patientName, String phoneNumber, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.phoneNumber = phoneNumber;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Getter 方法
    public String getPatientName() {
        return patientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // 打印所有实例变量的方法（保留，但不在此输出中使用）
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appointment Details:\n");
        sb.append("Patient Name: ").append(patientName).append("\n");
        sb.append("Phone Number: ").append(phoneNumber).append("\n");
        sb.append("Preferred Time Slot: ").append(preferredTimeSlot).append("\n");
        sb.append("Doctor: ").append(selectedDoctor.toString()).append("\n");
        return sb.toString();
    }
}