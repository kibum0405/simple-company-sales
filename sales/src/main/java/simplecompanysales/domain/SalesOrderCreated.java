package simplecompanysales.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import simplecompanysales.domain.*;
import simplecompanysales.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SalesOrderCreated extends AbstractEvent {

    private String salesOrderNumber;
    private String salesPerson;
    private String status;
    private CompanyId companyId;
    private SalesType salesType;
    private List<SalesItems> salesItems;

    public SalesOrderCreated(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderCreated() {
        super();
    }
}
//>>> DDD / Domain Event
