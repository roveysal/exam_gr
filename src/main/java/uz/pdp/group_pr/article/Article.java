package uz.pdp.group_pr.article;

import lombok.Data;

@Data
public class Article {
    private int id;
    private String title;
    private String author;
    private String content;
}
