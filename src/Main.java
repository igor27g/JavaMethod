public class Main {


    public static void main(String[] args) {

        pointsResult(true, "Chelsea", 15,10);
        forward("Chelsea","Alvaro Morata", 10,5);
        forward("Chelsea","Eden Hazard", 15,15);
        forward("Manchester United", "Paul Pogba", 5,10);
    }

    public static int pointsResult(boolean season, String team, int wins, int draw) {
        if (season) {
            int points = ((wins * 3) + draw);
            System.out.println(team + " has amounts of " + points + " points.");
            return points;
        }
        return -1;
    }

    public static int  forward(String club, String name, int goals, int assists) {
        if (club == "Chelsea") {
            System.out.println(name + " scored " + goals + " goals " + "and " + assists +" assists " + "for " + club + ".");
        }
        else if (club != "Chelsea") {
            System.out.println("He is not Chelsea player.");
        }
        return -1;
    }

}
