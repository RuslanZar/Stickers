package Ruslan.Stickers.controllers;

import Ruslan.Stickers.models.Sticker;
import Ruslan.Stickers.services.StickerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class StickerController {

    private final StickerService stickerService;
    @GetMapping("/sticker/{id}")
    public String stickerInfo(@PathVariable Long id, Model model){
        model.addAttribute("sticker", stickerService.getStickerById(id));
        return "stickerInfo";
    }

    @PostMapping("/sticker/create")
    public String createSticker(Sticker sticker) {
        stickerService.saveSticker(sticker);
        return "redirect:/";
    }

    @PostMapping("/sticker/delete/{id}")
    public String deleteSticker(@PathVariable Long id) {
        stickerService.deleteSticker(id);
        return "redirect:/";
    }
}
