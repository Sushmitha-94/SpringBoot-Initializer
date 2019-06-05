package com.sush.boot.dao;

import com.sush.boot.model.Ticket;

import java.util.Optional;

public interface TicketDAO {
    public Ticket getTicketDetails(Integer id);
    public Ticket insertTicket(Ticket ticket);
    public Ticket updateTicket(Ticket ticket);
    public void deleteTicket(Ticket ticket);
}
