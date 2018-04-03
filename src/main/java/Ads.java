import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<AD> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
}
