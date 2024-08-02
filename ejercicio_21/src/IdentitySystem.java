import java.util.HashMap;
import java.util.Map;

public class IdentitySystem {
    private Map<String, Person> persons = new HashMap<String, Person>();

    public void addIdentity(String id, Person person) {
        persons.put(id, person);
    }

    public Person getIdentity(String id) {
        return persons.get(id);
    }
}
