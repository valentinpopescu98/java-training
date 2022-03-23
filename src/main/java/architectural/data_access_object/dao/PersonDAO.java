package architectural.data_access_object.dao;

import architectural.data_access_object.model.PersonDTO;

import java.util.List;

public interface PersonDAO {
    void save(PersonDTO personDTO);
    void delete(PersonDTO personDTO);
    PersonDTO getByName(String name);
    List<PersonDTO> getAll();
}
