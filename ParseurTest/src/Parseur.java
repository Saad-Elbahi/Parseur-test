import java.util.Stack;

public class Parseur {
    private char tokenCourant;
    private TokenManager tm;

    private void avancer() {
        tokenCourant = tm.getTokenCourant();
    }

    public Parseur(TokenManager tm) {
        this.tm = tm;
        avancer();
    }

    private void consommer(char attendu) throws Exception {
        if (tokenCourant == attendu)
            avancer();
        else
            throw new Exception(attendu + " attendu;" + tokenCourant + "trouvé");
    }

    public void parse() throws Exception {
        E();
        if (tokenCourant != '#')
            throw new Exception("La chaîne n'est pas valide");
    }

    private void E() throws Exception {
     
        if (tokenCourant == '+' || tokenCourant == '-' || tokenCourant == '*' || tokenCourant == '/') {
            avancer();
            E();
            E();
        }
        // B-->c
        else if (tokenCourant == 'b') {
            avancer();
        } else if (tokenCourant == 'c') {
            avancer();
        } else if (tokenCourant == 'd') {
            avancer();
        } else
            throw new Exception("b ou c attendu; " + tokenCourant + "trouvé");
    }
}
