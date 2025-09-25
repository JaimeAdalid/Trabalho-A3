import java.util.ArrayList;

public class Team {
    // atributos necessários para a classe
    String teamName;
    String description;
    ArrayList<Person> members;

    public Team(String teamName, String description) {
        this.teamName = teamName;
        this.description = description;
        members = new ArrayList<>();
    }


    public void AddMember (Person person) {
        members.add(person);
    }

    public String getTeamName() {return teamName;}
    public String getDescription() {return description;}

    public ArrayList<Person> getMembers() {
        return members;
    }
}
