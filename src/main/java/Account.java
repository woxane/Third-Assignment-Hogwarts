import java.util.UUID;
import java.util.Objects;
import org.apache.commons.codec.digest.DigestUtils;

public class Account implements AccountManagement{
    String username;
    String password;
    final UUID accountID;
    final String role;
    Rate rating;
    Account (String username , String password , String role) {
        this.username = username;
        this.password = DigestUtils.sha256Hex(password);
        this.accountID = UUID.randomUUID();
        this.role = role;

    }

    public boolean validatePassword(String enteredPassword) {
        return Objects.equals(DigestUtils.sha256(enteredPassword), this.password);
    }

    public void changeUsername(String newUsername) {
        this.username = newUsername;
    }

    public void changePassword(String newPassword) {
        this.password = DigestUtils.sha256Hex(newPassword);
    }
}
