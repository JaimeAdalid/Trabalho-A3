import java.util.ArrayList;

public class Team {
    // atributos necessários para a classe
    String teamName;
    String description;
    ArrayList<Person> members;

    public Team(String teamName) {
        this.teamName = teamName;
        members = new ArrayList<>();
    }


    public void AddMember (Person person) {
        members.add(person);
    }
}
