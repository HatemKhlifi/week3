package org.asb.service;

import java.util.List;

import org.asb.dao.TicketDao;
import org.asb.dao.TicketDestinataireDao;
import org.asb.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketService {
	@Autowired
	private TicketDao ticketDao;
	@Autowired
	private TicketDestinataireDao  ticketDestinataireDao;

	@RequestMapping(value = "/ticket", method = RequestMethod.POST)
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		ticketDao.save(ticket);
		return ticket;
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.PUT)
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		ticketDao.save(ticket);
		return ticket;
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public List<Ticket> getTickets() {
		return ticketDao.findAll();
	}

	@RequestMapping(value = "/ticket/{id}", method = RequestMethod.GET)
	public Ticket getTicket(@PathVariable Long id) {
		return ticketDao.findOne(id);
	}

	@RequestMapping(value = "/ticket/{id}", method = RequestMethod.DELETE)
	public void deleteTicket(@PathVariable Long id) {
		ticketDao.delete(id);
	}
	
	@RequestMapping(value = "/deleteTacheDestByTicketId/{id}", method = RequestMethod.GET)
	public long deleteTacheDestByTicketId(@PathVariable Long id) {
		ticketDestinataireDao.deleteTacheDestByTicketId(id);
		
		return 1L;
	}
	
	
}
