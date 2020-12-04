
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String teamInput = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                String line = fileReader.nextLine();
                String parts[] = line.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int visitScore = Integer.valueOf(parts[3]);                
                
                
                if (homeTeam.equals(teamInput) || visitTeam.equals(teamInput)) {
                    games++;
                }
                if (homeTeam.equals(teamInput) && homeScore > visitScore || visitTeam.equals(teamInput) && visitScore > homeScore) {
                    wins++;
                } else if (homeTeam.equals(teamInput) || visitTeam.equals(teamInput)) {
                    losses++;
                }
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
