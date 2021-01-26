package spring.mvc.service;

import spring.mvc.entity.Client;

import java.util.List;

public interface ClientService {

    public List<Client> getAllClients();
    public void saveClient(Client client);
    public Client getClient(int id);
    public void deleteClient(int id);
}
