package uz.pdp.group_pr.article;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ArticleRepository {
    public List<Article> articles = new ArrayList<>();
}
