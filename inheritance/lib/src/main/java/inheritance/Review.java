package inheritance;

public class Review {
String moive;
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
    public Review(String body, String author, int rate,String moive) {
        if (rate>=1 && rate <=5){
            this.body = body;
            this.author = author;
            this.rate = rate;
             this.moive=moive;
        }

    }

    public void setRate(int rate) {
       if (rate >=1 && rate <= 5)
       {this.rate = rate;}
    }


    @Override
    public String toString() {
        if (moive == null){
            return
                    "{ body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", rate=" + rate +
                    '}';
        }else{
            return "{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", movie='" + moive + '\'' +
                    ", rate=" + rate +
                    '}';

        }

    }
}
