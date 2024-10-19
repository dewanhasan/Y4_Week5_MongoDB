package ie.atu.week5.customerapp;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderRequest {

    @Valid
    private Customer customer;
    @Valid
    private List<Order> orders;

}
