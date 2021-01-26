package spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.mvc.entity.Client;

import java.util.List;

/* @Repository - это специализированный @Component. Данная аннотация используется для DAO.
    При поиске компонентов, Spring так же будет регистрировать все DAO с аннотацией @Repository в Spring Container-e.
 */

@Repository
public class ClientDAOImpl implements ClientDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Client> getAllClients() {
        Session session = sessionFactory.getCurrentSession();
//        List<Client> AllClients = session.createQuery("from Client", Client.class).getResultList();
        Query<Client> query = session.createQuery("from Client", Client.class);
        List<Client> AllClients = query.getResultList();
        return AllClients;

    }

    @Override
    public void saveClient(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(client);
    }

    @Override
    public Client getClient(int id) {
        Session session = sessionFactory.getCurrentSession();
        Client client = session.get(Client.class, id);
        return client;
    }

    @Override
    public void deleteClient(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Client> query = session.createQuery("delete from Client " + "where id=:clientsId");
        query.setParameter("clientsId", id);
        query.executeUpdate();

    }
}
