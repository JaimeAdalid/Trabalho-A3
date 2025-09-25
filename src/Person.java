// classe pessoa que servirá como base para as classes administrador, gerente e colaborador que a herdarão posteriormente
public class Person {

    // atributos necessários para a classe
    private String completeName;
    private String CPF;
    private String email;
    private String role;
    private String login;
    private String password;

    Person(String completeName, String CPF, String email, String login, String password) {
        this.completeName = completeName;
        this.CPF = CPF;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getCompleteName() {
        return completeName;
    }
    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getCPF() {return CPF;}

    public String getEmail() {return email;}

    public String getLogin() {return login;}
    
    public String getPassword() {return password;}

}
