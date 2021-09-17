var testEditor;

// markdown配置
// $(function() {
//     testEditor = editormd("test-editormd", {
//         width           : "90%",
//         height:640,
//         path            : "./editTest/lib/",
//         htmlDecode      : "style,script,iframe",
//         tex             : true,
//         emoji           : true,
//         taskList        : true,
//         flowChart       : true,
//         sequenceDiagram : true
//     });
// });
$(function() {
    testEditor = editormd("test-editormd", { //注意1：这里的就是上面的DIV的id属性值
        width: "90%",
        height: 740,
        syncScrolling: true, //设置双向滚动
        path: "./editTest/lib/", //lib目录的路径
        //previewTheme : "dark", //代码块使用dark主题
        codeFold : true,
        emoji:true,
        tocm : true, // Using [TOCM]
        tex : true, // 开启科学公式TeX语言支持，默认关闭
        flowChart : true, // 开启流程图支持，默认关闭
        sequenceDiagram : true, // 开启时序/序列图支持，默认关闭,
        htmlDecode : true, //不过滤标签
        imageUpload : true, //上传图片
        imageFormats : ["jpg", "jpeg", "gif", "png", "bmp", "webp","JPG","JPEG","GIF","PNG","BMP","WEBP"],
        imageUploadURL : "/uploadImage",
        onload:function () {
            // console.log('onload', this);
        },
        saveHTMLToTextarea: true, //注意3：这个配置，方便post提交表单
        toolbarIcons : function () {
            return ["bold","del","italic","quote","|","h1","h2","h3","h4","h5","h6","|","list-ul","list-ol","hr","|","link","image","code","code-block","table","datetime","html-entities","emoji","|","watch","preview","fullscreen","clear","search","|","help","info"]
        }
    });

});

//保存文章
$(".article-publish").on("click",function (){
    var content=testEditor.getMarkdown();
    var article={
        articleContent:content,
        articleTitle:"test1",
        articleId:"1",
        author:"hs的第一次测试"
    }
    $.ajax({
        url:"/saveArticle",
        type:"post",
        contentType:"application/json;character=utf-8",
        dataType:"json",
        data:JSON.stringify(article),
        success:function (result) {
            if (result.code===200){

            }
        }
    })
})