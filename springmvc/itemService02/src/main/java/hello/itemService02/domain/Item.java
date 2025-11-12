package hello.itemService02.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public void changeId(Long id){
        this.id=id;
    }

    public void changeItemInfo(String itemName, Integer price, Integer quantity) {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
}
