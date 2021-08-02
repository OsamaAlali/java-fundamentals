package inheritance;

public class Review {

    String body;
    String author;
    int rate;

    public Review(String body, String author, int rate) {
        if (rate>=1 && rate <=5){
        this.body = body;
        this.author = author;
        this.rate = rate;
        }
    }


    public void setRate(int rate) {
       if (rate >=1 && rate <= 5)
       {this.rate = rate;}
    }


    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", rate=" + rate +
                '}';
    }
}
