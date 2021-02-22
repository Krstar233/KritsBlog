package fun.krits;

import fun.krits.entity.Blog;
import fun.krits.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void saveTest(){
        Blog blog = new Blog();
        blog.setContent("xxx");
        blog.setCategory("c");
        blog.setDate(new Date());
        blog.setTag("tag");
        blog.setTitle("title");
        blogService.save(blog);
    }

    @Test
    public void TestGetBlogById(){
        Blog blog = blogService.getBlogById(1);
        System.out.println(blog);
    }

    @Test
    public void TestSelectAll(){
        List<Blog> list = blogService.selectAll();
        for (Blog b : list){
            System.out.println(b);
        }
    }

    @Test
    public void TestDeleteById(){
        blogService.deleteById(2);
    }

    @Test
    public void TestUpdate(){
        Blog blog = new Blog();
        blog.setId(1);
        blog.setContent("xxx");
        blog.setCategory("c");
        blog.setDate(new Date());
        blog.setTag("tag");
        blog.setTitle("title");

        blogService.update(blog);
    }
}
