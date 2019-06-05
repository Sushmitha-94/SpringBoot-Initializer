package com.sush.boot.service;

import com.sush.boot.dao.TicketDAO;
import com.sush.boot.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDAO ticketDAOImpl;

    @Override
    public Ticket getTicketDetils(Integer id) {
        Ticket ticket= ticketDAOImpl.getTicketDetails(id);
        return ticket;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        ticket = ticketDAOImpl.insertTicket(ticket);
        return ticket;
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        ticket = ticketDAOImpl.updateTicket(ticket);
        return ticket;
    }

    @Override
    public void deleteTicket(Integer id) {
        ticketDAOImpl.deleteTicket(getTicketDetils(id));
    }
}
