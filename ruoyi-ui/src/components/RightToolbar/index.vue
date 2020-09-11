<!-- @author Shiyn/   huangmx 20200807优化-->
<template>
  <div class="top-right-btn">
    <el-row>
      <el-tooltip :content="showSearch ? '隐藏搜索' : '显示搜索'" class="item" effect="dark" placement="top">
        <el-button @click="toggleSearch()" circle icon="el-icon-search" size="mini"/>
      </el-tooltip>
      <el-tooltip class="item" content="刷新" effect="dark" placement="top">
        <el-button @click="refresh()" circle icon="el-icon-refresh" size="mini"/>
      </el-tooltip>
    </el-row>
  </div>
</template>
<script>
export default {
  name: "RightToolbar",
  data() {
    return {};
  },
  props: {
    showSearch: {
      type: Boolean,
      default: true,
    },
  },

  methods: {
    //搜索
    toggleSearch() {
      this.$emit("update:showSearch", !this.showSearch);
    },
    //刷新
    refresh() {
      this.$emit("queryTable");
    },
  },
};
</script>
