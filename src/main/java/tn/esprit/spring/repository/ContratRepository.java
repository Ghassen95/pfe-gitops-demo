package tn.tekup.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.tekup.spring.entities.Contrat;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long>{

}
