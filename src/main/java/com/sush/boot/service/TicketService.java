package com.sush.boot.service;

import com.sush.boot.model.Ticket;

import java.util.Date;

public interface TicketService {
    public Ticket getTicketDetils(Integer id);
    public Ticket saveTicket(Ticket ticket);
    public Ticket updateTicket(Ticket ticket);
    public void deleteTicket(Integer id);
}
