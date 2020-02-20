package hashcode.domain;

public class Book {
    private int id;
    private int score;

    public Book(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setScore(int score){
        this.score = score;
    }
}
