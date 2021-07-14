<template>
  <div style="padding: 0;border: 0;background-color: #f5f7fa">
    <img src="../src/assets/tag.png" style="margin: -10px;padding: -10px;border: 0" @click="change" alt="setting">
    <div style="
    width: 100%; height: 100%;
">

      <input v-model="ques" @click="mouseOver" @mouseleave="mouseOut"
             style="width: 100%;
             height: 50%;
             background-color: transparent;
             color: gray;
             border: 0px black solid;
             outline: none;"
      />

      <div v-if="show">
        <div v-for="ans in answers" style="margin: 10px;width: 100%;">
          <div v-for="timu in ans['timu']">
            <div>{{ timu }}</div>
          </div>
          <div style="color: #347abb">{{ ans['ans'] }}</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import $ from 'jQuery';

export default {
  name: 'HelloWorld',
  data() {
    return {
      answers: [],
      ques: "",
      show: false,
      webUrl: ""
    }
  },
  mounted() {
    this.show = false;
  },
  watch: {
    ques(val) {
      if (val) {
        this.query(val);
      }
    }
  },
  methods: {
    change: function () {
      let s = window.prompt();
      this.webUrl = (s == null) ? "" : s;
    },
    mouseOver: function () {

    },
    mouseOut: function () {
      let ans = "";
      for (let i=0; i<this.answers.length;i++) {
        ans += this.answers[i]['ans'] + "\n";
      }
      this.$copyText(ans).then(function () {
        console.log("粘贴成功");
      }).catch(function () {
        console.log("粘贴失败!");
      });
      this.answers = [];
      this.ques = "";
    },

    //通过参数查询
    query: function (question) {
      this.show = false;
      var that = this;
      $.ajax({
        url: that.webUrl+"/st/" + question,
        dataType: 'json',
        method: 'get',
        success: function (data) {
          let obj = data.data;
          for (let i = 0; i < obj.length; i++) {
            let timu = obj[i]['timu'].split('\n');
            let ans = obj[i]['ans'];
            that.answers[i] = {timu, ans};
            that.show = true;
          }
        },
        error: function (err) {
          console.log('查询错误:' + err.data);
        }
      });
    },
  }
}
</script>
<style scoped>
</style>
