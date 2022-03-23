package architectural.data_access_object.service;

import architectural.data_access_object.model.PersonDTO;
import architectural.data_access_object.dao.PersonDAO;

import java.util.List;

public class PersonService {
    private final PersonDAO dao;

    public PersonService(PersonDAO dao) {
        this.dao = dao;
    }

    public void save(PersonDTO personDTO) {
        dao.save(personDTO);
    }

    public void delete(PersonDTO personDTO) {
        dao.delete(personDTO);
    }

    public PersonDTO getByName(String name) {
        return dao.getByName(name);
    }

    public List<PersonDTO> getAll() {
        return dao.getAll();
    }
}
