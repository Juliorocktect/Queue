public class Statist
{
    private String name;
    private Geschlecht geschlecht;
    private int score;
    
    public Statist(String name,Geschlecht geschlecht,int pScore){
        this.name = name;
        this.geschlecht = geschlecht;
        score = pScore;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public Geschlecht getGeschlecht(){return geschlecht;}
    public void setGeschlacht(Geschlecht geschlecht){this.geschlecht = geschlecht;}
    public void setScore(int score){this.score = score;}
    public int getScore(){return score;}
}