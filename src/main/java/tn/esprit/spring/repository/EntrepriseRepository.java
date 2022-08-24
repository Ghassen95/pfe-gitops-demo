package tn.tekup.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.tekup.spring.entities.Entreprise;

@Repository
public interface EntrepriseRepository extends  CrudRepository <Entreprise, Long> {

}
