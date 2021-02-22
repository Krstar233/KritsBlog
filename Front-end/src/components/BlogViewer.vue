<template>
  <div>
    <div v-for="blog in blogList">
      <blog-card
        :content="blog.content"
        :title="blog.title"
        :date="blog.date"
        :tag="blog.tag"
        :category="blog.category">
      </blog-card>
    </div>
  </div>
</template>

<script>
    import BlogCard from "@/components/BlogCard";
    export default {
      name: "BlogViewer",
      components: {BlogCard},
      data(){
        return{
          blogList: []
        }
      },
      created(){
        this.$http.get("http://localhost:8989/blog/findAll").then(res=>{
          this.blogList = res.data;
        })
      }
    }
</script>

<style scoped>

  .text {
    font-size: 14px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }

  .box-card {
    width: 480px;
  }
</style>
