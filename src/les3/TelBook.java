package les3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TelBook implements ITelBook {

    private final Map<String, Set<String>> telBySurname;

    public TelBook() {
        telBySurname = new TreeMap<>();
    }

    @Override
    public void add(String surname, String telNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(telNumber);
    }

    private Set<String> getPhones(String surname) {


        return telBySurname.computeIfAbsent(surname, key -> new HashSet<>());
    }

    @Override
    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public Set<String> getAllSurnames() {
        return telBySurname.keySet();
    }
}

