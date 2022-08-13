package org.example.blog;


import org.example.blog.domain.Article;
import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.BlogSearchService;
import org.example.blog.domain.BlogService;
import org.example.blog.domain.Tag;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        try (var container = new AnnotationConfigApplicationContext(BlogConfiguration.class)){
            var articleService = container.getBean(BlogService.class);

            articleService.addArticle(
                    Article.builder()
                            .category("inna")
                            .mode(ArticleMode.DRAFT)
                            .tagList(Collections.singletonList(Tag.BUSINESS))
                            .url("jakis")
                            .title("inny")
//                            .publicationDate(LocalDate.now())
                    .build());


            var articleSearchService = container.getBean(BlogSearchService.class);

            articleSearchService.getByCategory("inna").stream().forEach(System.out::println);

        }
    }

}
