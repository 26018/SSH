<!--<template>-->
<!--  <div class="hello" style="background-color: black">-->
<!--    <div >-->
<!--      <input type="text" @focusin="xx" v-model="ques">-->
<!--      <button @click="func">提交</button>-->

<!--      <div v-for="answer in answers">-->
<!--        <div>题目:{{ answer['timu'] }} <span style="color: red">答案:{{ answer['ans'] }}</span></div>-->
<!--      </div><br><hr>-->
<!--    </div>-->

<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--import $ from 'jQuery';-->

<!--export default {-->
<!--  name: 'HelloWorld',-->
<!--  data() {-->
<!--    return {-->
<!--      ques: "",-->
<!--      answers: []-->
<!--  }-->
<!--  },-->
<!--  methods:{-->

<!--    mouseOver: function () {-->
<!--      alert("over!!!!")-->
<!--    },-->

<!--    xx: function () {-->
<!--      navigator.clipboard-->
<!--        .readText()-->
<!--        .then((v) => {-->
<!--          console.log("获取剪贴板成功：", v);-->
<!--          this.query(v);-->
<!--        })-->
<!--        .catch((v) => {-->
<!--          console.log("获取剪贴板失败: ", v);-->
<!--        });-->
<!--    },-->

<!--    query: function (question) {-->
<!--      var that = this;-->
<!--      $.ajax({-->
<!--        url: "http://localhost:80/st/" + question,-->
<!--        dataType: 'json',-->
<!--        method: 'get',-->
<!--        success: function (data) {-->
<!--          that.answers = data.data;-->
<!--        },-->
<!--        error: function (err) {-->
<!--          alert("错误了....");-->
<!--        }-->
<!--      });-->
<!--    },-->

<!--    func: function () {-->
<!--      this.query(this.ques);-->
<!--      that.ques = "";-->
<!--    }-->
<!--  }-->
<!--}-->
<!--</script>-->
<!--<style scoped>-->
<!--</style>-->
