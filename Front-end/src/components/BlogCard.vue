<template>
  <div>
    <el-card class="box-card" style="width: 90%; margin: 20px 5%">
      <div slot="header" class="clearfix" style="font-size: 30px; font-weight: bold">
        {{ title }}
      </div>
      <div class="wrap markdown-body" v-html="this.$markdown.makeHtml(content)">
      </div>
      <div style="font-size: small; font-weight: normal; text-align: right; margin-top: 15px">
        <el-tag size="mini">{{tag}}</el-tag>
        <el-link style="font-size: small" type="primary">{{category}}</el-link>
        <span>| {{date}}</span>
      </div>
    </el-card>
  </div>
</template>

<script>
    export default {
      name: "BlogCard",
      props:['content', 'title', 'tag', 'category', 'date']
    }
</script>

<style scoped>
  .wrap{
    overflow: hidden;
    text-overflow: ellipsis;
    word-break: break-all;
  }

</style>
