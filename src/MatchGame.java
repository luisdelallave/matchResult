public class MatchGame {

    public String HomeTeamName;
    public Integer HomeTeamScore;
    public String AwayTeamName;
    public Integer AwayTeamScore;

    //Get example of doc and decided always the match intro will be like:
    //HT - AT: HS - AS (H for Home, T for Team, A for Away, S for Score)
    public MatchGame(String matchString) {
        String[] firstAuxArray = matchString.split(":");
        String teams = firstAuxArray[0];
        String score = firstAuxArray[1];
        String[] secondAuxArray = teams.split("-");
        String[] thirdAuxArray = score.split("-");
        HomeTeamName = secondAuxArray[0].trim();
        AwayTeamName = secondAuxArray[1].trim();
        HomeTeamScore = Integer.valueOf(thirdAuxArray[0].trim());
        AwayTeamScore = Integer.valueOf(thirdAuxArray[1].trim());
    }

    public Integer getTotalScore(){
        return HomeTeamScore + AwayTeamScore;
    }

    public void setHomeTeamName(String homeTeamName) {
        HomeTeamName = homeTeamName;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        HomeTeamScore = homeTeamScore;
    }

    public void setAwayTeamName(String awayTeamName) {
        AwayTeamName = awayTeamName;
    }

    public void setAwayTeamScore(Integer awayTeamScore) {
        AwayTeamScore = awayTeamScore;
    }

    public String getHomeTeamName() {
        return HomeTeamName;
    }

    public Integer getHomeTeamScore() {
        return HomeTeamScore;
    }

    @Override
    public String toString() {
        return HomeTeamName + ' ' + HomeTeamScore + " - "
                + AwayTeamName + ' ' + AwayTeamScore;

    }

    public String getAwayTeamName() {
        return AwayTeamName;
    }

    public Integer getAwayTeamScore() {
        return AwayTeamScore;
    }
}
