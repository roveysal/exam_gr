package uz.pdp.group_pr.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Article getArticleById(int id) {
        return articleRepository.articles.get(id);
    }

    public List<Article> getAllArticles() {
        return articleRepository.articles;
    }

    public Article createArticle(Article article) {
        if (getArticleById(article.getId()) == null) {
            articleRepository.articles.add(article);
            return article;
        }else {
            throw new RuntimeException("Article already exists");
        }
    }

    public Article updateArticle(int id, Article article) {
        if (getArticleById(id) == null) {
            throw new RuntimeException("Article does not exist");
        }else {
            articleRepository.articles.set(id, article);
            return article;
        }
    }

    public void deleteArticle(int id) {
        articleRepository.articles.remove(id);
    }
}
