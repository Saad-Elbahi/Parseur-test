public class App {
    public static void main(String[] args) throws Exception {
    	String ch = "+bc";
        TokenManager tm = new TokenManager(ch);
        Parseur p = new Parseur(tm);
        try {
            p.parse();
            System.out.println(ch + " est valide");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}}
