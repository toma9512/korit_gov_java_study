package _26_Singleton.AppConfig;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppConfig {
    private static AppConfig instance;

    // 앱의 설정값들
    private String apiKey;
    private String appMode;

    private AppConfig() {
        this.apiKey = "DEFAULT_KEY";
        this.appMode = "PRODUCTION";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}
