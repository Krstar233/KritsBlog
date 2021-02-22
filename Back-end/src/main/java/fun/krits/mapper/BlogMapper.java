package fun.krits.mapper;

import fun.krits.entity.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {
    Blog selectById(Integer id);
    void insert(Blog blog);
    List<Blog> selectAll();
    void deleteById(Integer id);
    void update(Blog blog);
}
