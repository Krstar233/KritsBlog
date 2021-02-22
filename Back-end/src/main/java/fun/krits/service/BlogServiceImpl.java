package fun.krits.service;

import fun.krits.entity.Blog;
import fun.krits.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public void save(Blog blog) {
        blogMapper.insert(blog);
    }

    @Override
    public Blog getBlogById(Integer id) {
        return blogMapper.selectById(id);
    }

    @Override
    public List<Blog> selectAll() {
        return blogMapper.selectAll();
    }

    @Override
    public void deleteById(Integer id) {
        blogMapper.deleteById(id);
    }

    @Override
    public void update(Blog blog) {
        blogMapper.update(blog);
    }
}
