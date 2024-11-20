import java.util.ArrayList;

// 假设 HealthProfessional, GeneralPractitioner, Specialist, 和 Appointment 类已经正确实现
// 且每个类都有合适的构造函数和 toString() 方法

public class AssignmentOne {
    public static void main(String[] args) {
        // 第 3 部分 - 使用类和对象
        HealthProfessional gp1 = new GeneralPractitioner(322, "Dr. Mu", "General Practitioner","123-456-7890",36);
        HealthProfessional gp2 = new GeneralPractitioner(252, "Dr. Sun", "Family Medicine Specialist","123-123-1234",41);
        HealthProfessional specialist1 = new Specialist(355, "Dr. Yang", "Cardiologist");
        HealthProfessional specialist2 = new Specialist(471, "Dr. Hu", "Neurologist");

        System.out.println(gp1.toString());
        System.out.println(gp2.toString());
        System.out.println(specialist1.toString());
        System.out.println(specialist2.toString());
        System.out.println("--------------------------------");

        // 第 5 部分 - 预约收款（这里应该是“预约集合”或“预约列表”的意思）
        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("Jack Doe", "138-310-6207", "08:00", gp1));
        appointments.add(new Appointment("Sank Smith", "134-830-9855", "9:30", gp2));
        appointments.add(new Appointment("Son Johnson", "139-104-9053", "15:00", specialist1));
        appointments.add(new Appointment("John Brown", "189-517-6697", "16:30", specialist2));

        printExistingAppointments(appointments);
        cancelBooking(appointments, "1234567890");
        printExistingAppointments(appointments);
    }

    // 打印现有预约的方法
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Print existing appointment.");
            for (Appointment appointment : appointments) {
                System.out.println(appointment.toString());
            }
        }
    }

    // 取消预约的方法
    public static void cancelBooking(ArrayList<Appointment> appointments, String phoneNumber) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPhoneNumber().equals(phoneNumber)) {
                appointments.remove(i);
                found = true;
                System.out.println("Appointment for patient with phone " + phoneNumber + " has been cancelled.");
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for the provided phone number.");
        }
    }
}