// classe pessoa que servirá como base para as classes administrador, gerente e colborador herderam posteriormente
public class Person {

    // atributos necessários para a classe
    String completeName;
    String CPF;
    String email;
    String role;
    String login;
    String password;

    Person(String completeName) {
        this.completeName = completeName;

    }

    public String getCompleteName() {
        return completeName;
    }
    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

}
