package hello.itemService02.web.basic;

import hello.itemService02.domain.Item;
import hello.itemService02.domain.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository repository;

    @GetMapping
    public String items(Model model){
        List<Item> items=repository.findAll();
        model.addAttribute("items", items);
        return "basic/items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable Long itemId, Model model){ // /items/5로 들어왔을 때 itemId에 5L이 들어감
        Item item = repository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/item";
    }

    @GetMapping("/add")
    public String addForm(){
        return "basic/addForm";
    }

    @PostMapping("/add")
    public String addItemV3(Item item){
        repository.save(item);
        return "basic/item";
    }

    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Item item, Model model) {
        repository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/editForm";
    }

    @PostConstruct
    public void init(){
        repository.save(new Item("itemA", 10000, 10));
        repository.save(new Item("itemB", 20000, 20));
    }
}
