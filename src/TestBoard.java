import org.junit.Test;

public class TestBoard {

    @Test
    public void TestCreateMatch(){
        String game = "Mexico - Canada: 0 - 5";
        MatchGame match = new MatchGame(game);
        assert(match.toString().equals("Mexico 0 - Canada 5"));
    }

    @Test
    public void TestCreateBoard(){
        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.addMatch("Mexico - Canada: 0 - 5");
        scoreBoard.addMatch("Spain - Brazil: 10 - 2");
        scoreBoard.addMatch("Germany - France: 2 - 2");
        scoreBoard.addMatch("Uruguay - Italy: 6 - 6");
        scoreBoard.addMatch("Argentina - Australia: 3 - 1");

        System.out.print(scoreBoard);
        assert(scoreBoard.matchResults.get(0).toString().equals("Spain 10 - Brazil 2"));
    }
}
