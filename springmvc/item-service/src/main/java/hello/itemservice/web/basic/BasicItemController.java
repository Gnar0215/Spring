package hello.itemservice.web.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basic/items") // 주소 경로
@RequiredArgsConstructor
public class BasicItemController {

    private final ItemRepository itemRepository;

    @GetMapping // get 요청을 받으면 메서드 호출
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items); // 컨트롤러에서 조회한 데이터를 items라는 이름으로 모델아 담아 타임리프 템플릿에서 사용할 수 있게 전달
        return "basic/items"; // 파일 경로
    }

    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 1033000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
    }

}
