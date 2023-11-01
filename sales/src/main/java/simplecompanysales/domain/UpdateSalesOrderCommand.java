package simplecompanysales.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateSalesOrderCommand {

    private String salesOrderNumber;
    private String salesPerson;
    private String status;
    private CompanyId companyId;
    private SalesType salesType;
    private List<SalesItems> salesItems;
}
