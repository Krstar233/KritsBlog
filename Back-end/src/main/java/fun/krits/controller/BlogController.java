package fun.krits.controller;

import fun.krits.entity.Blog;
import fun.krits.service.BlogService;
import fun.krits.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("addBlog")
    public Result addBlog(@RequestBody Blog blog){
        Result res = new Result();
        try{
            blogService.save(blog);
            res.setMsg("添加博客成功！");
        }catch (Exception e){
            res.setStatus(false);
            res.setMsg("添加博客失败，请稍后再试！");
        }
        return res;
    }

    @GetMapping("deleteBlog")
    public Result deleteBlog(Integer id){
        Result res = new Result();
        try{
            blogService.deleteById(id);
            res.setMsg("博客删除成功！");
        }catch (Exception e){
            res.setStatus(false);
            res.setMsg("删除博客失败，请稍后再试！");
        }
        return res;
    }

    @PostMapping("updateBlog")
    public Result updateBlog(@RequestBody Blog blog){
        Result res = new Result();
        try{
            blogService.update(blog);
            res.setMsg("博客更新成功！");
        }catch (Exception e){
            res.setStatus(false);
            res.setMsg("博客更新失败！");
        }
        return res;
    }

    @GetMapping("findById")
    public Blog findById(Integer id){
        return blogService.getBlogById(id);
    }

    @GetMapping("findAll")
    public List<Blog> findAll(){
        return blogService.selectAll();
    }
}
