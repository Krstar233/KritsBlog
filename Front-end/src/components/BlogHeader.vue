<template>
  <div>
    <el-menu class="el-menu-demo" mode="horizontal">
      <el-menu-item>
        <span>KRITS BLOG</span>
      </el-menu-item>
      <el-menu-item style="margin-left:65%;">
        <el-input
          size="mini"
          placeholder="输入关键字搜索博客">
        </el-input>
        <i class="el-icon-search"></i>
      </el-menu-item>
    </el-menu>
    <div class="line"></div>
  </div>
</template>

<script>
    export default {
      name: "BlogHeader"
    }
</script>

<style scoped>

</style>
