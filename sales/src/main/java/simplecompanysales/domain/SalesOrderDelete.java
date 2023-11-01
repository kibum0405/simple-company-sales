package simplecompanysales.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import simplecompanysales.domain.*;
import simplecompanysales.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SalesOrderDelete extends AbstractEvent {

    private Long salesOrderNumber;

    public SalesOrderDelete(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderDelete() {
        super();
    }
}
//>>> DDD / Domain Event
