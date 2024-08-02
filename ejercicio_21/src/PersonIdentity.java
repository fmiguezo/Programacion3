import java.util.HashMap;
import java.util.Map;

public class PersonIdentity {
    private IdentitySystem identitySystem;

    public PersonIdentity(IdentitySystem identitySystem) {
        this.identitySystem = identitySystem;
    }

    public Person getInfo(String id) {
        return identitySystem.getIdentity(id);
    }
}
