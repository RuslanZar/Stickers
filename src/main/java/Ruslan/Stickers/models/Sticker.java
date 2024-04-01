package Ruslan.Stickers.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Sticker {
    private Long id;
    private String title;
    private String description;
    private String author;
    private String creationDate;
    private String deadline;
}
