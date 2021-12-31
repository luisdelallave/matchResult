import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreBoard {

    public List<MatchGame> matchResults;

    public ScoreBoard() {
        this.matchResults = new ArrayList<>();
    }

    public void addMatch(String match){
        MatchGame newMatch = new MatchGame(match);
        matchResults.add(newMatch);

    }

    @Override
    public String toString() {
        matchResults.sort((MatchGame mg1, MatchGame mg2) ->{
            if(mg2.getTotalScore().equals(mg1.getTotalScore())){
                return 1;
            }else{
                return mg2.getTotalScore() - mg1.getTotalScore();
            }
        });

        String result =matchResults.stream().map(MatchGame ::toString).collect(Collectors.joining("\r\n"));
        return result;

    }
}
