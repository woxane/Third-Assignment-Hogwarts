import java.util.UUID;
import java.util.Objects;

public class Account implements AccountManagement{
    private String username;
    private String password;
    private final UUID accountID;

    Account (String username , String password) {
        this.username = username;
        this.password = password;
        this.accountID = UUID.randomUUID();

    }

    public boolean validatePassword(String enteredPassword) {
        return Objects.equals(enteredPassword, this.username);
    }

    public void changeUsername(String newUsername) {
        //TODO
    }

    public void changePassword(String newPassword) {
        //TODO
    }
}
