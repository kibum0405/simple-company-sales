package simplecompanysales.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import simplecompanysales.SalesApplication;
import simplecompanysales.domain.SalesOrderDelete;

@Entity
@Table(name = "SalesOrder_table")
@Data
//<<< DDD / Aggregate Root
public class SalesOrder {

    @Id
    private String salesOrderNumber;

    private String salesPerson;

    private String status;

    @Embedded
    private CompanyId companyId;

    private SalesType salesType;

    @ElementCollection
    private List<SalesItems> salesItems;

    @PostPersist
    public void onPostPersist() {
        SalesOrderDelete salesOrderDelete = new SalesOrderDelete(this);
        salesOrderDelete.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {}

    public static SalesOrderRepository repository() {
        SalesOrderRepository salesOrderRepository = SalesApplication.applicationContext.getBean(
            SalesOrderRepository.class
        );
        return salesOrderRepository;
    }

    //<<< Clean Arch / Port Method
    public void createSalesOrder(
        CreateSalesOrderCommand createSalesOrderCommand
    ) {
        //implement business logic here:

        SalesOrderCreated salesOrderCreated = new SalesOrderCreated(this);
        salesOrderCreated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void updateSalesOrder(
        UpdateSalesOrderCommand updateSalesOrderCommand
    ) {
        //implement business logic here:

        SalesOrderUpdated salesOrderUpdated = new SalesOrderUpdated(this);
        salesOrderUpdated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void produce(ProduceCommand produceCommand) {
        //implement business logic here:

        Produced produced = new Produced(this);
        produced.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
