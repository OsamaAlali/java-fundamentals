package inheritance;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant implements  Zelp{
String name;
    int stars;
   int priceCategory;
   Set<Review> review;

     Restaurant(String name, int priceCategory) {

         this.name = name;
         this.priceCategory = priceCategory;
         this.review = new HashSet<Review>();
     }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public void addReview(Review review1) {
        int sum =0;

        review.add(review1);
    for (Review i : review) {
        sum = sum + i.rate;
    }
   setStars((sum/review.size()));
    }

    //public  void addReview(Review review1) {
//          int sum =0;
//
//        review.add(review1);
//    for (Review i : review) {
//        sum = sum + i.rate;
//    }
//   setStars((sum/review.size()));
//    }

    @Override
    public String toString() {
         String dollar="";
        for (int i = 0; i < priceCategory; i++) {
            dollar +="$";
        }
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", dollar='" + dollar + '\'' +
                ", review=" + review +

                '}';
    }
}
