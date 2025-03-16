package pl.pjatk.grzpio;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Do 3 zadania klasa zagniezdzona
//stworzyc 3 stringi z nazwami user password login z yml
@ConfigurationProperties(prefix ="custom", "credentials")
@Configuration
public class Config {

    private String login;
    private String user;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
