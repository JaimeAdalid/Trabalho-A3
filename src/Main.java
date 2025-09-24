import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> persons = new ArrayList<>();
    static ArrayList<Project> projects = new ArrayList<>();
    static ArrayList<Team> teams = new ArrayList<>();


    public static void main(String[] args) {


        int counter = 1;
        boolean finishedPersonsRegister = false;
        int userInput = 0;

        String tempName = ""; // variavel temporaria para quando for instanciar um objeto


        System.out.println("Bem vindo ao gerenciador de projetos");
        System.out.println("O primeiro passo é cadastrar todos os funcionários envolvidos nos projetos");
        System.out.println("quantas pessoas você gostaria de cadastrar?");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < userInput; i++) {
            System.out.println("Por favor, informe o nome do " + counter + "º funcionário");
            counter++;

            tempName = scanner.nextLine();

            Administrator administrator = new Administrator(tempName);
            persons.add(administrator);

            //System.out.println(persons.get(i).completeName);
        }

        counter = 1;
        System.out.println("Agora vamos cadastrar os projetos, quantos projetos você quer cadastrar?");
        userInput = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < userInput; i++) {
            System.out.println("Por favor, informe o nome do " + counter + "º projeto");
            counter++;
            tempName = scanner.nextLine();

            Project project = new Project(tempName);
            projects.add(project);

        }

        counter = 1;

        System.out.println("Agora vamos criar novas equipes, quantas equipes você deseja criar?");
        userInput = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < userInput; i++) {
            System.out.println("Por favor, informe o nome da " + counter + "ª equipe");
            counter++;
            tempName = scanner.nextLine();

            Team team = new Team(tempName);
            teams.add(team);

            System.out.println("Agora vamos adicionar pessoas as equipes, veja a lista abaixo");


            for (int j = 0; j < persons.size(); j++){
                int moreReadableCounter = 0;
                moreReadableCounter += j + 1;
                System.out.println(moreReadableCounter + ": " + persons.get(j).getCompleteName());
            }

            System.out.println("Digite o numero do funcionario que você deseja adicionar a equipe");
            userInput = scanner.nextInt();
            userInput -=1;
            teams.get(i).AddMember(persons.get(userInput));
            scanner.nextLine();

        }

        System.out.println("Programa terminado");

        scanner.close();
    }

}