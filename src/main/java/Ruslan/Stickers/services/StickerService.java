package Ruslan.Stickers.services;

import Ruslan.Stickers.models.Sticker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StickerService {
    private List<Sticker> stickersList = new ArrayList<>();
    private long ID = -1;
    {
        stickersList.add(new Sticker(++ID,"Java basic","Java java java","Ruslan", "01-04-2024","01-05-2024"));
        stickersList.add(new Sticker(++ID,"Java basic","Java java java","Ruslan", "01-04-2024","06-06-2024"));
    }

    public List<Sticker> getListOfStickers(){
        return stickersList;
    }

    public void saveSticker(Sticker sticker){
        sticker.setId(++ID);
        stickersList.add(sticker);
    }
    public void deleteSticker(Long id){
        stickersList.removeIf(sticker -> sticker.getId().equals(id));
    }

    public Sticker getStickerById(Long id) {
        return stickersList.get(Math.toIntExact(id));
    }
}
