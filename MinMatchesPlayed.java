import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMatchesPlayed {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Player [] arr = new Player[n];
        
        for (int i = 0; i < arr.length; i++) {
            int id= sc.nextInt();
            int matchesPlayed = sc.nextInt();
            int totalRuns = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();
            arr[i] = new Player(id, matchesPlayed, totalRuns, name, team);
        }
           Player obj = findPlayerWithMinimumMatchesPlayed(arr);
           if(obj == null){
               System.out.println("No player found with mentioned attribute");
           }else{
               System.out.println("id-"+obj.getId());
               System.out.println("matchesPlayed-"+obj.getMatchesPlayed());
               System.out.println("totalRuns-"+ obj.getTotalRuns());
               System.out.println("name-"+obj.getName());
               System.out.println("team-"+obj.getTeam());
           }
    }
    public static Player findPlayerWithMinimumMatchesPlayed(Player[] p){
        Player res = null;
        int max= Integer.MAX_VALUE;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getMatchesPlayed()< max) {
                max = p[i].getMatchesPlayed();
                res = p[i];
            } 
        }return res;
    }
}
class Player{
    private int id;
    private int matchesPlayed;
    private int totalRuns;
    private String name;
    private String team;
    
    public Player(int id, int matchesPlayed, int totalRuns, String name, String team){
        this.id= id;
        this.matchesPlayed=matchesPlayed;
        this.totalRuns= totalRuns;
        this.name= name;
        this.team= team;
    }
    // getters
    public int getId(){
        return id;
    }
    public int getMatchesPlayed(){
        return matchesPlayed;
    }
    public int getTotalRuns(){
        return totalRuns;
    }
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
}