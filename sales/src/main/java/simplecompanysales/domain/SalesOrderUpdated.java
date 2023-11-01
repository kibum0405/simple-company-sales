package simplecompanysales.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import simplecompanysales.domain.*;
import simplecompanysales.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SalesOrderUpdated extends AbstractEvent {

    private String salesOrderNumber;
    private String salesPerson;
    private String status;
    private CompanyId companyId;
    private SalesType salesType;
    private List<SalesItems> salesItems;

    public SalesOrderUpdated(SalesOrder aggregate) {
        super(aggregate);
    }

    public SalesOrderUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
