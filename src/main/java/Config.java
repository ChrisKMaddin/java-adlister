public class Config {
    private String url = "jdbc:mysql://localhost/db_name?serverTimezone=UTC";
    private String username = "wonka";
    private String password = "chocolate";


    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
