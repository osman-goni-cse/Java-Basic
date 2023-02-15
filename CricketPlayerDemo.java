import java.lang.annotation.Retention;

class CricketPlayer {
    private static int totalScore;
    private int score;
    String name;

    CricketPlayer(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        this.score += score;
        totalScore += score;
    }

    public static int getTotalScore() {
        return totalScore;
    }

    public int getScore() {
        return this.score;
    }
}

public class CricketPlayerDemo {
    public static void main(String[] args) {
        CricketPlayer Tamim = new CricketPlayer("Tamim Iqbal");
        Tamim.addScore(8);
        Tamim.addScore(3);
        Tamim.addScore(15);

        CricketPlayer Sakib = new CricketPlayer("Sakib Al Hasan");
        Sakib.addScore(12);
        Sakib.addScore(7);

        CricketPlayer Mustafiz = new CricketPlayer("Mustafizur Rahman");
        Mustafiz.addScore(1);
        Mustafiz.addScore(3);
        Mustafiz.addScore(1);

        System.out.println("Tamim: "+Tamim.getScore());
        System.out.println("Sakib: "+Sakib.getScore());
        System.out.println("Mustafiz: "+Mustafiz.getScore());

        System.out.println("Bangladesh Score: "+CricketPlayer.getTotalScore());
    }
}
