import java.util.Date;

public class MatchInfo {
    String countryName1;
    String countryName2;
    String matchType;
    String result;


    public MatchInfo(String countryName1, String countryName2, String matchType, String result) {
        this.countryName1 = countryName1;
        this.countryName2 = countryName2;
        this.matchType = matchType;
        this.result = result;
    }

    @Override
    public String toString() {
        return "MatchInfo{" +
                "countryName1='" + countryName1 + '\'' +
                ", countryName2='" + countryName2 + '\'' +
                ", matchType='" + matchType + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public String getCountryName1() {
        return countryName1;
    }

    public void setCountryName1(String countryName1) {
        this.countryName1 = countryName1;
    }

    public String getCountryName2() {
        return countryName2;
    }

    public void setCountryName2(String countryName2) {
        this.countryName2 = countryName2;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
