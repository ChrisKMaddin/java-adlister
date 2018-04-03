public class DaoFactory {
    private static Ads adsDao;
    private static Config Config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);

        }
        return adsDao;
    }
}
