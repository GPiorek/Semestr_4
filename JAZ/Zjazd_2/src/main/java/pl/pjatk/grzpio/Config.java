package pl.pjatk.grzpio;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//Do 3 zadania klasa zagniezdzona
//stworzyc 3 stringi z nazwami user password login z yml
@ConfigurationProperties(prefix = "custom")
@Configuration
public class Config {

    private String login;
    private Credentials credentials;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public static class Credentials{
        private String user;
        private String password;

        public Credentials(String user, String password) {
            this.user = user;
            this.password = password;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


}
