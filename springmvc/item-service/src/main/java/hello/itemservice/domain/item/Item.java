package hello.itemservice.domain.item;

import lombok.Data;

@Data
// Lombok이 자동으로 만들어줌
//public Long getId() { return id; }
//public void setId(Long id) { this.id = id; }
//
//public String getItemName() { return itemName; }
//public void setItemName(String itemName) { this.itemName = itemName; }
//
//public Integer getPrice() { return price; }
//public void setPrice(Integer price) { this.price = price; }
//
//public Integer getQuantity() { return quantity; }
//public void setQuantity(Integer quantity) { this.quantity = quantity; }

public class Item {
    // 자바 빈
    // 캡슐 구조 (private으로 )
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(){
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
