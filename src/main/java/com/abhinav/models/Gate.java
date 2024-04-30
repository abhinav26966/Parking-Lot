package com.abhinav.models;

import com.abhinav.enums.GateStatus;
import com.abhinav.enums.GateType;

public class Gate {
    private GateStatus status;
    private GateType type;
    private Operator operator;

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }


    public Long getId() {
        return null;
    }
}
