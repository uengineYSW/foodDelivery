package fooddelivery.domain;

import fooddelivery.MarketingApplication;
import fooddelivery.domain.PromotedSimilarMenu;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Preference_table")
@Data
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String menuid;

    @PostPersist
    public void onPostPersist() {
        PromotedSimilarMenu promotedSimilarMenu = new PromotedSimilarMenu(this);
        promotedSimilarMenu.publishAfterCommit();
    }

    public static PreferenceRepository repository() {
        PreferenceRepository preferenceRepository = MarketingApplication.applicationContext.getBean(
            PreferenceRepository.class
        );
        return preferenceRepository;
    }

    public static void orderDetailsCollection(FoodOrdered foodOrdered) {
        /** Example 1:  new item 
        Preference preference = new Preference();
        repository().save(preference);

        */

        /** Example 2:  finding and process
        
        repository().findById(foodOrdered.get???()).ifPresent(preference->{
            
            preference // do something
            repository().save(preference);


         });
        */

    }
}
