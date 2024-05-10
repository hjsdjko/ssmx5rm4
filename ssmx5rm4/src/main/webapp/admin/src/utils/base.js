const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmx5rm4/",
            name: "ssmx5rm4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmx5rm4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "英语学习交流平台小程序"
        } 
    }
}
export default base
