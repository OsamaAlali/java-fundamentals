package inheritance;

import java.util.HashSet;
import java.util.Set;

public class Shop implements  Zelp {
    String  name;
    String description;
   String dollar="";
Set<Review> review;
    public Shop(String name, String description) {
        this.name = name;
        this.description = description;

       review= new HashSet<Review>();
    }

    @Override
    public void addReview(Review review1) {
        int sum =0;
         int avg=0;
        review.add(review1);
        for (Review i : review) {
            sum = sum + i.rate;
        }
        avg=(sum/review.size());
        for (int i = 0; i < avg; i++) {
            dollar +="$";
        }
    }
    // TODO: 8/3/2021

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollar='" + dollar + '\'' +
                ", review=" + review +
                '}';
    }
}




