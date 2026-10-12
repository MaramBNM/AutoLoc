package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    private ClientRepository clientRepository;

    @Override
    public Set<Client> retrieveAllClients() {
        return new HashSet<>(clientRepository.findAll());
    }

    @Override
    public Client retrieveClient(Long clientId) {
        return clientRepository.findById(clientId).get();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }
}