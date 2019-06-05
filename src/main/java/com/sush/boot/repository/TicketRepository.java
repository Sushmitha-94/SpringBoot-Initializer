package com.sush.boot.repository;

import com.sush.boot.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket,Integer> {
}
