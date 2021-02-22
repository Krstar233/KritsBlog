<template>
    <div style="color:#606266; padding: 0px 50px;">
      <el-row style="text-align: center;">
        <el-col :span="24">
          <div style="margin: 50px auto;">
            <el-avatar :size="150" :src="circleUrl"></el-avatar>
            <h1>“山不在高，有仙则名；水不在深，有龙则灵”</h1>
          </div>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="24">
          <el-collapse v-model="activeNames" @change="handleChange">
            <el-collapse-item title="标签 Tags" name="1">
              <a href="">
                <el-tag style="margin: 5px;" @click="tag">标签一</el-tag>
              </a>
              <el-tag style="margin: 5px;" type="success">标签二</el-tag>
              <el-tag style="margin: 5px;" type="info">标签三</el-tag>
              <el-tag style="margin: 5px;" type="warning">标签四</el-tag>
              <el-tag style="margin: 5px;" type="danger">标签五</el-tag>
            </el-collapse-item>
            <el-collapse-item title="分类 Categories" name="2">
              <el-link href="https://element.eleme.io" target="_blank" style="margin: 5px;">分类1</el-link>
              <el-link style="margin: 5px;" type="primary">分类2</el-link>
              <el-link style="margin: 5px;" type="success">分类3</el-link>
              <el-link style="margin: 5px;" type="warning">分类4</el-link>
              <el-link style="margin: 5px;" type="danger">分类5</el-link>
              <el-link style="margin: 5px;" type="info">分类6</el-link>
            </el-collapse-item>
            <el-collapse-item title="友链 Friendship links" name="3">
              <el-link style="margin: 5px;" type="success">友情链接1</el-link>
              <el-link style="margin: 5px;" type="primary">友情链接2</el-link>
            </el-collapse-item>
            <el-collapse-item title="关于我 About me" name="4">
              <div>用户决策：根据场景可给予用户操作建议或安全提示，但不能代替用户进行决策；</div>
              <div>结果可控：用户可以自由的进行操作，包括撤销、回退和终止当前操作等。</div>
            </el-collapse-item>
          </el-collapse>
        </el-col>
      </el-row>
    </div>
</template>

<script>
    export default {
        name: "PersonalView",
      data () {
        return {
          circleUrl: "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
          activeNames: ['1']
        }
      },
      methods:{
        tag(){
          console.log("TAG!");
        },
        handleChange(val) {
          console.log(val);
        }
      }
    }
</script>

<style scoped>

</style>
