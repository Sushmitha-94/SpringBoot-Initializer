package com.sush.boot.dao;

import com.sush.boot.repository.TicketRepository;
import com.sush.boot.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDAOImpl implements TicketDAO{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket getTicketDetails(Integer id) {
        return ticketRepository.findById(id).get();
    }

    @Override
    public Ticket insertTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(Ticket ticket) {
        ticketRepository.deleteById(ticket.getId());
    }
}
