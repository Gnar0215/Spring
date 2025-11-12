package hello.itemService02.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemRepositoryTest {
    ItemRepository repository = new ItemRepository();

    @AfterEach
    void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save() throws Exception{
        //given
        Item item = new Item("ItemA", 10000, 10);

        //when
        Item savedItem = repository.save(item);

        //then
        Item findItem = repository.findById(savedItem.getId());
        assertThat(findItem).isEqualTo(savedItem);
    }

    @Test
    public void findAll() throws Exception{
        //given
        Item item1 = new Item("itemA", 10000, 10);
        Item item2 = new Item("itemB", 20000, 20);

        repository.save(item1);
        repository.save(item2);

        //when
        List<Item> findItems = repository.findAll();

        //then
        assertThat(findItems.size()).isEqualTo(2);
        assertThat(findItems).contains(item1, item2);
    }

    @Test
    public void updateItem() throws Exception {
        //given
        Item item1 = new Item("itemA",10000, 10);
        Item savedItem = repository.save(item1);
        Long itemId = savedItem.getId();

        //when
        Item updateItem = new Item("itemB", 20000, 20);
        repository.update(itemId, updateItem);
        Item findItem = repository.findById(itemId);

        //then
        assertThat(findItem.getItemName()).isEqualTo(updateItem.getItemName());
        assertThat(findItem.getPrice()).isEqualTo(updateItem.getPrice());
        assertThat(findItem.getQuantity()).isEqualTo(updateItem.getQuantity());

    }
}
