package Lab15Program;

import java.util.HashMap;

public class Login {
    private HashMap<String, String> users = new HashMap<String, String>() {{
        put("Ana", "123");
        put("Radu", "mere");
        put("Valeriu", "pere");
    }};
    private String user;
    private String pass;

    Login(String user, String password) {
        this.user = user;
        this.pass = password;
    }

    public boolean isValid() {
        String password = users.get(this.user);
        return pass.equals(password);
    }
}
