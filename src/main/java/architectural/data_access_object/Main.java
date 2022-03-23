package architectural.data_access_object;

import architectural.data_access_object.dao.PersonDAOImpl;
import architectural.data_access_object.model.PersonDTO;
import architectural.data_access_object.service.PersonService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService(new PersonDAOImpl());

        PersonDTO gigi = new PersonDTO("Gigi", 34);
        PersonDTO ionut = new PersonDTO("Ionut", 27);
        PersonDTO alina = new PersonDTO("Alina", 36);

        service.save(gigi);
        service.save(ionut);
        service.save(alina);

        System.out.println("Before delete:");
        List<PersonDTO> persons = service.getAll();
        persons.forEach(person -> System.out.println(
                "name: " + person.getName() + ", age: " + person.getAge()));

        service.delete(ionut);

        System.out.println("After delete:");
        persons = service.getAll();
        persons.forEach(person -> System.out.println(
                "name: " + person.getName() + ", age: " + person.getAge()));

        System.out.println("Get one:");
        PersonDTO person = service.getByName("Alina");
        System.out.println("name: " + person.getName() + ", age: " + person.getAge());
    }
}
