package org.example.blog;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        try (var container = new AnnotationConfigApplicationContext(BlogConfiguration.class)){

        }
    }

}
