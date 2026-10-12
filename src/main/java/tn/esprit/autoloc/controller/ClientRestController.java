package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    private IClientService clientService;

    @GetMapping("/retrieve-all-clients")
    public Set<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @DeleteMapping("/delete-client/{client-id}")
    public void deleteClient(@PathVariable("client-id") Long clientId) {
        clientService.deleteClient(clientId);
    }

    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
}