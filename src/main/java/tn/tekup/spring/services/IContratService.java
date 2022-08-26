package tn.tekup.spring.services;

import java.util.List;

import tn.tekup.spring.entities.Contrat;


public interface IContratService {
	List<Contrat> retrieveAllContracts(); 
	Contrat addContract(Contrat c);
	void deleteContract(String id);
	Contrat updateContract(Contrat c);
	Contrat retrieveContract(String id);

}
