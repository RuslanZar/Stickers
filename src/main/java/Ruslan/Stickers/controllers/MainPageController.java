package Ruslan.Stickers.controllers;

import Ruslan.Stickers.services.StickerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainPageController {

    private final StickerService stickerService;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("stickerList", stickerService.getListOfStickers());
        return "mainPage";
    }
}
