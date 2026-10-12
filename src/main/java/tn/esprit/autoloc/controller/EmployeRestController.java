package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.interfaces.IEmployeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {

    private IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public Set<Employe> getEmployes() {
        return employeService.retrieveAllEmployes();
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        return employeService.retrieveEmploye(employeId);
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @DeleteMapping("/delete-employe/{employe-id}")
    public void deleteEmploye(@PathVariable("employe-id") Long employeId) {
        employeService.deleteEmploye(employeId);
    }

    @PutMapping("/update-employe")
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }
}