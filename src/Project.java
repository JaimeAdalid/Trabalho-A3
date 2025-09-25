
public class Project {

    //atributos necessários para a classe
    private String projectName;
    private String description;
    private String startDate;
    private String endDate;
    private String status;

    Project(String projectName, String description, String startDate, String endDate, String status) {
        this.projectName = projectName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;

    }

    public String getProjectName() {return projectName;}
    public String getDescription() {return description;}
    public String getStartDate() {return startDate;}
    public String getEndDate() {return endDate;}
    public String getStatus() {return status;}



}
