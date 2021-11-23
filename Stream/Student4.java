package Stream;

public class Student4{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;
    Student4(String name, boolean isMale, int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String toString(){
        return String.format("[%s, %s, %d학년, %d반, %3d점]", name, isMale ? "남":"여", hak, ban, score);
    }

    String getName() {return name;}
    boolean isMale() {return isMale;}
    int getHak() {return hak;}
    int getBan() {return ban;}
    int getScore() {return score;}
    
    enum Level {HIGH, MID, LOW}
}