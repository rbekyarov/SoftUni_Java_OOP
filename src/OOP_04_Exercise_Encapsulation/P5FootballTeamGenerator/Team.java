package OOP_04_Exercise_Encapsulation.P5FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.equals("null")) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }


    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        for (Player player : players) {
            if (name.equals(player.getName())) {
                players.remove(player);
                return;
            }
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", player, this.name));
        }
    }

    public double getRating() {
        return players.stream().mapToDouble(e -> e.overallSkillLevel()).sum() / this.players.size();
    }
}
