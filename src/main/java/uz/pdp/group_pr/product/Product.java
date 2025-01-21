package uz.pdp.group_pr.product;


import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int  id;
    private String name;
    private String description;
    private double price;

}
