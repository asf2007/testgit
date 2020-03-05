package les3;

import java.util.Set;

public interface ITelBook {

    void add(String surname, String telNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();

}
