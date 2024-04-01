package me.kimyoungjae.springbootdeveloper.repository;

import me.kimyoungjae.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

