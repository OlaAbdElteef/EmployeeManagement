package adapter;

// External System Class (Incompatible with our Employee interface)
public class ExternalEmployee {
    private String fullName;
    private String jobType;

    public ExternalEmployee(String fullName, String jobType) {
        this.fullName = fullName;
        this.jobType = jobType;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobType() {
        return jobType;
    }

    public void displayInfo() {
        System.out.println("External Employee Data:");
        System.out.println("Name: " + fullName);
        System.out.println("Job Type: " + jobType);
    }
}

