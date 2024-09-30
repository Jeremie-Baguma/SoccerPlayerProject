//- Create SoccerPlayer class
//Task:
//a. Create SoccerPlayers class which will have name, age, team, scoredGoals.
//b. Create 3 Constructor (name, age, team, scoredGoals) (name, age, scoredGoals) (name, age, team)
//c. Create getter and setter for all variables.
//d. Override toString function
//e. Override equals function to compare scoredGoals and team (just two of them)
//f. Create main function and in the main function create 5-6 players. Then Test all of them.
//g. Create github repo for this project from your github and publish your codes in your github, then send the link to me.

public class SoccerPlayer {
    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    public SoccerPlayer(String name, int age, String team, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }

    public SoccerPlayer(String name, int age, String team) {
        this(name, age, team, 0); // Default scoredGoals to 0
    }


    public SoccerPlayer(String name, int age, int scoredGoals) {
        this(name, age, "Unknown", scoredGoals); // Default team to "Unknown"
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }


    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                ", scoredGoals=" + scoredGoals +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) obj;
        return scoredGoals == that.scoredGoals && team.equals(that.team);
    }


    public static void main(String[] args) {
        SoccerPlayer player1 = new SoccerPlayer("Lionel Messi", 36, "Inter Miami", 800);
        SoccerPlayer player2 = new SoccerPlayer("Cristiano Ronaldo", 39, "Al Nassr", 850);
        SoccerPlayer player3 = new SoccerPlayer("Neymar", 31, "Al Hilal", 400);
        SoccerPlayer player4 = new SoccerPlayer("Kylian Mbappe", 25, "PSG", 300);
        SoccerPlayer player5 = new SoccerPlayer("Kevin De Bruyne", 32, "Manchester City", 120);


        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);


        System.out.println("Is player1 equal to player2? " + player1.equals(player2));
        System.out.println("Is player2 equal to player1 with same goals and team? " + new SoccerPlayer("Cristiano Ronaldo", 39, "Al Nassr", 850).equals(player2));
    }
}
