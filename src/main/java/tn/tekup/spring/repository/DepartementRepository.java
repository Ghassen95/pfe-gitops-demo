package tn.tekup.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.tekup.spring.entities.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement, Long>{

}
