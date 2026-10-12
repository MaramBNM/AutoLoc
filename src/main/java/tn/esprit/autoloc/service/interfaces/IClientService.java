package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Client;

import java.util.Set;

public interface IClientService {

    Set<Client> retrieveAllClients();

    Client retrieveClient(Long clientId);

    Client addClient(Client client);

    void deleteClient(Long clientId);

    Client updateClient(Client client);
}