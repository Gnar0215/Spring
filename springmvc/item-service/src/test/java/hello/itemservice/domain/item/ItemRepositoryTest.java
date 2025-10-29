package hello.itemservice.domain.item;

// JUnit5 : 테스트 실행용 라이브러리
import org.junit.jupiter.api.AfterEach; // 각 테스트가 끝날 때 마다 실행해줘!
import org.junit.jupiter.api.Test; // 이건 테스트로 실행해줘!

import java.util.List;

// AssertJ : 테스트 결과를 예상값과 실제값이 같은지 검증하는 도구
import static org.assertj.core.api.Assertions.*;

//ItemRepository의 기능을 테스트하기 위한 클래스
class ItemRepositoryTest {
    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach() { // 각 테스트 메서드가 끝날 때 마다 store를 비워주는 메서드
        itemRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Item item = new Item("itemA", 10000, 10);
        //when
        Item savedItem = itemRepository.save(item);
        //then
        Item findItem = itemRepository.findById(item.getId());
        assertThat(findItem).isEqualTo(savedItem);
    }

    @Test
    void findAll() {
        //given
        Item item1 = new Item("item1", 10000, 10);
        Item item2 = new Item("item2", 20000, 20);

        itemRepository.save(item1);
        itemRepository.save(item2);

        //when
        List<Item> result = itemRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(item1, item2);
    }

    @Test
    void updateItem() {
        //given : item1 저장 후 그 ID를 꺼내둠
        Item item = new Item("item1", 10000, 10);

        Item savedItem = itemRepository.save(item);
        Long itemId = savedItem.getId();

        //when : 새 updateParam을 만들어 update() 호출
        Item updateParam = new Item("item2", 20000, 20);
        itemRepository.update(itemId, updateParam);

        //then : ID로 다시 찾아서 이름, 가격, 수량이 모두 바뀌었는지 확인
        Item findItem = itemRepository.findById(itemId);

        assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
        assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
        assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());

    }
}
