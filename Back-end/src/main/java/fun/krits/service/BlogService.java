package fun.krits.service;

import fun.krits.entity.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BlogService{
    void save(Blog blog);
    Blog getBlogById(Integer id);
    List<Blog> selectAll();
    void deleteById(Integer id);
    void update(Blog blog);
}


