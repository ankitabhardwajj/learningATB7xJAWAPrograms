package ex_12062025;

public enum APIconstants {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    CHATBOT_PAGE("https://app.vwo.com/chatbot"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard");





    public final String name;
    APIconstants(String name){
        this.name = name;
    }

    public String getvalue(){
        return name;
    }
}
