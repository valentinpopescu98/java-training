package architectural.data_access_object.dao;

import architectural.data_access_object.model.PersonDTO;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    private List<PersonDTO> persons = new ArrayList<>();

    @Override
    public void save(PersonDTO personDTO) {
        persons.add(personDTO);
    }

    @Override
    public void delete(PersonDTO personDTO) {
        persons.remove(personDTO);
    }

    @Override
    public PersonDTO getByName(String name) {
        return persons.stream()
                .filter(personDTO -> personDTO.getName().equals(name))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Entity not found!"));
    }

    @Override
    public List<PersonDTO> getAll() {
        return persons;
    }
}
