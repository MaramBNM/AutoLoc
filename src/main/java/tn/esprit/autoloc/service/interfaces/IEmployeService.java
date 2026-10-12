package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Employe;

import java.util.Set;

public interface IEmployeService {

    Set<Employe> retrieveAllEmployes();

    Employe retrieveEmploye(Long employeId);

    Employe addEmploye(Employe employe);

    void deleteEmploye(Long employeId);

    Employe updateEmploye(Employe employe);
}