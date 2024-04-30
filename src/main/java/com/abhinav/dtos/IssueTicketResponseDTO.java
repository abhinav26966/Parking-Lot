package com.abhinav.dtos;

import com.abhinav.enums.ResponseStatus;
import com.abhinav.models.Ticket;

public class IssueTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
