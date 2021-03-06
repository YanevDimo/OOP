package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
    }

    private void setName(String name){
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should be empty");
        }
        this.name = name;
    }
    public double getRating(){
        return this.players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.0);
    }
    public void addPlayer(Player player){
         this.players.add(player);
    }
    public void removePlayer(String name){
        boolean isRemoved = this.players.removeIf(player -> player.getName().equals(name));
        if (!isRemoved) {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team",name,this.name));
        }
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
