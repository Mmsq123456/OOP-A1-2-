public class Specialist extends HealthProfessional {
    // 额外的实例变量（如果需要）
    // 例如：专业领域、医院名称等
    private String specialty;
    private String hospitalName;

    // 默认构造函数
    public Specialist() {
        super();
    }

    // 第二个构造函数
    public Specialist(int id, String name, String specialty, String hospitalName) {
        super(id, name, "Specialist");
        this.specialty = specialty;
        this.hospitalName = hospitalName;
    }

    // 简化构造函数，仅用于本次作业
    public Specialist(int id, String name, String specialty) {
        this(id, name, specialty, "General Hospital");
    }

    // 打印医疗专业人员详细信息的方法
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString().replace("Description: Specialist", "Description: Medical Specialist")); // 修改描述以区分
        sb.append("Specialty: ").append(specialty).append("\n");
        sb.append("Hospital: ").append(hospitalName).append("\n");
        return sb.toString();
    }
}