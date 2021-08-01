package inheritance;
import java.lang.*;

public class Restaurant {
String name="";
int rate=0;
String dollar="";
static int count=0;
int sum=0;
Review review;

     Restaurant(String name, int dollar) {
          review=new Review();
        this.name = name;
        this.dollar = String.valueOf(dollar)+"$";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        count++;
        review.setRate(rate);
         sum +=  review.getRate()  ;
     this.rate = sum/count;
    }

    public String getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = String.valueOf(dollar);
    }


public  void addReview(int rate,String author,String body){
    review.setBody(body);
    review.setAuthor(author);
    setRate(rate);
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", dollar='" + dollar + '\'' + review.toString() +

                '}';
    }
}
