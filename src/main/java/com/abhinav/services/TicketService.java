package com.abhinav.services;

import com.abhinav.enums.VehicleType;
import com.abhinav.exceptions.InvalidGateException;
import com.abhinav.models.Gate;
import com.abhinav.models.Operator;
import com.abhinav.models.Ticket;
import com.abhinav.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        return ticket;
    }
}
