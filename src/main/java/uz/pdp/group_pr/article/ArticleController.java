package uz.pdp.group_pr.article;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/add")
    public void addArticle(@RequestBody Article article) {
        articleService.createArticle(article);
    }

    @GetMapping("/all")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticle(@PathVariable int id) {
        return articleService.getArticleById(id);
    }

    @PutMapping("/update/{id}")
    public void updateArticle(@PathVariable int id, @RequestBody Article article) {
        articleService.updateArticle(id, article);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticle(@PathVariable int id) {
        articleService.deleteArticle(id);
    }
}
