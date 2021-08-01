package inheritance;

public class Review {

    String body="";
    String author="";
    int rate;
Review(){

}
    public Review(String body, String author, int rate) {
        this.body = body;
        this.author = author;
        this.rate = rate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRate() {
        return rate;
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
