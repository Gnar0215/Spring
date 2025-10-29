package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList; // 리스트나 맵같은 컬렉션 자료 구조를 불러옴
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository //데이터 저장소 역할의 빈(Bean)으로 인식하게 해주는 에너테이션
public class ItemRepository { // 클래스 선언
// Item 객체에 있는 getter/setter 호출해서 사용

    // Long=상품의 ID, Item=상품 객체
    // private : 이 클래스 안에서만 접근 가능하게 하는 접근제어자
    // static이라 애플리케이션 전체에서 하나만 존재 (공유 저장소)
    // final : 다른 객체로 덮어쓰기 불가능
    private static final Map<Long, Item> store = new HashMap<>(); //static 사용, 실제 데이터를 저장할 저장소 역할의 HashMap

    //상품마다 고유ID를 부여하기 위한 일련번호 변수
    // 저장할 때마다 ++sequence로 1씩 증가시켜 ID 생성
    private static long sequence = 0L;

    // 새로운 상품을 저장하는 메서드
    // 상품 등록 기능
    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    // 저장소에서 ID로 상품을 조회하는 메서드
    // Map의 키(ID)로 찾고 없을 경우 null반환
    public Item findById(Long id) {
        return store.get(id);
    }

    // 저장소에 있는 모든 상품 목록 반환
    // Map의 value들을 꺼내서 ArrayList로 새로 만들어 리턴
    public List<Item> findAll(){
        return new ArrayList<>(store.values());
    }

    // 기존 상품 수정 기능
    public void update(Long itemId, Item updateParam) {
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    // 저장소 초기화
    public void clearStore() {
        store.clear();
    }
}
