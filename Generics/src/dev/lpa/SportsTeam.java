package dev.lpa;

import java.util.ArrayList;
import java.util.List;

interface Player{}

record Player(String name, String position){

}

public class SportsTeam {

    private String teamName;
    //best practices generic interface list generic class the ArrayList. List as the reference type
    private List<Player> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public SportsTeam(String teamName){
        this.teamName = teamName;
    }
    public void addTeamMember(Player player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){

        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){

        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
         return teamName + "(Ranked " + ranking() + ")";
    }
}
