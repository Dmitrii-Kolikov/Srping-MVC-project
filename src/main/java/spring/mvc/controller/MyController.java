package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.dao.ClientDAO;
import spring.mvc.entity.Client;
import spring.mvc.service.ClientService;

import javax.validation.Valid;
import java.util.List;

// @Controller - это специализированный @Component.
@Controller
public class MyController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String showAllClients(Model model) {
        List<Client> allClients = clientService.getAllClients();
        model.addAttribute("AllClns", allClients);
        return "all-clients";
    }

    @RequestMapping("/addNewClient")
    public String addNewClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "client-info";
    }

    @RequestMapping("/saveClient")
    public String saveClient(@Valid @ModelAttribute("client") Client client, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "client-info";
        }
        else {
        clientService.saveClient(client);
        return "redirect:/"; }
    }


    @RequestMapping("/updateInfo")
    public String updateClient(@RequestParam("clientId") int id, Model model) {
        Client client = clientService.getClient(id);
        model.addAttribute("client", client);
        return "client-info";
    }

    @RequestMapping("/deleteClient")
    public String deleteClient(@RequestParam("clientId") int id) {
        clientService.deleteClient(id);
        return "redirect:/";
    }
}
