<template>
  <div id="app">
    <el-container>
      <el-header>
        <blog-header></blog-header>
      </el-header>
      <el-container>
        <el-main>
          <blog-viewer></blog-viewer>
        </el-main>
        <el-aside width="400px">
          <personal-view></personal-view>
        </el-aside>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import BlogViewer from "@/components/BlogViewer";
import PersonalView from "@/components/PersonalView";
import BlogHeader from "@/components/BlogHeader";

export default {
  name: 'App',
  components: {BlogHeader, PersonalView, BlogViewer}
}
</script>

<style>
</style>
