public class DaoFactory {
    private static Ads adsDao;
    private static config config = new config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();

        }
        return adsDao;
    }
}
