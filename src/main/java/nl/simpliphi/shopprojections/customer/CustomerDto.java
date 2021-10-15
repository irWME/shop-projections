package nl.simpliphi.shopprojections.customer;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Value
@Builder(toBuilder = true)
@Document(indexName = "customer")
public class CustomerDto {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;
}
