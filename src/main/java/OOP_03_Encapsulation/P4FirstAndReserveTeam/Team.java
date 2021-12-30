package OOP_03_Encapsulation.P4FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    @Override
    public String toString() {
        String firstTeamSrt = "First team";
        String reservTeamSrt = "Reserve team";
        return String.format("%s have %d players%n",firstTeamSrt,firstTeam.size())+
               String.format("%s have %d players%n",reservTeamSrt,reserveTeam.size());
    }
}
