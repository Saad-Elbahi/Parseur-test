import java.util.StringTokenizer;

public class TokenManager {
    private String chaine;
    private int tokenCourant;

    public TokenManager(String chaine) {
        this.chaine = chaine;
    }

    public char getTokenCourant() {
        if (tokenCourant < chaine.length())
            return chaine.charAt(tokenCourant++);
        return '#';
    }
}