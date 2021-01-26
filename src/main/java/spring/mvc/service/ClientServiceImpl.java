package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.dao.ClientDAO;
import spring.mvc.entity.Client;

import java.util.List;
//Аннотация @Service отмечает класс, содержащий бизнесс-логику.
//В иерархии компонентов приложения Service является соедитнительным звеном между Controller-ом и DAO.
 /* Service - это специализированный @Component. При поиске компонентов, Spring так же будет
 регистрировать все классы с аннотацией @Service в Spring Container-e.
  */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

//  При использовании ннотации @Transactional, Spring берет на себя ответственность за открытие и закрытие транзакций.
    @Transactional
    @Override
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Transactional
    @Override
    public void saveClient(Client client) {
       clientDAO.saveClient(client);
    }
}
