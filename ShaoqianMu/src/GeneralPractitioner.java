public class GeneralPractitioner extends HealthProfessional {
    private String specialty;   // 专科领域
    private String phoneNumber; // 医生的电话号码
    private int age;            // 患者的年龄

    // 构造器
    public GeneralPractitioner(int id, String name, String specialty, String phoneNumber, int age) {
        super(id, name, "General Practitioner"); // 调用父类构造器
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // Getter 和 Setter 方法
    public String getSpecialty() {
        return specialty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        // 输出医生信息并加上患者年龄
        return super.toString() + "Specialty: " + specialty + "\nPhone Number: " + phoneNumber + "\nAge: " + age + "\n";
    }
}
