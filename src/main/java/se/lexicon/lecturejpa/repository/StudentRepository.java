package se.lexicon.lecturejpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.lecturejpa.entity.Student;

// https://spring.io/projects/spring-data-jpa

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {


}
