package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService TicketService;

    @GetMapping
    public List<Ticket> getAllTickets() {
        System.out.println(TicketService.getAllTickets());
        
        // convert get Ticket object into json list
        return TicketService.getAllTickets();

    }

    // enter data into database
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket Ticket) {

        System.out.println(Ticket);
        return TicketService.createTicket(Ticket);
    }

    // Other controller methods...

}
