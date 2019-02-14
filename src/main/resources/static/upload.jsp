<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="jquery-1.10.2.min.js"></script>
</head>
<body>

<form action="upload1.html" method="post" enctype="multipart/form-data">
    文件<input name="file1" type="file"/>
    说明<input name="title"/>
    <input type="submit" value="提交">
</form>


<form action="/world/adddynamic" method="post" enctype="multipart/form-data">
    文件1<input name="file" type="file"/>
    文件2<input name="file" type="file"/>
    <input type="submit" value="批量提交">
</form>



<form id="ajaxForm">
    文件<input name="file" type="file" id="ajaxFile"/>
    <input type="button" value="ajax提交" onclick="ajaxUpload()">
</form>

<script >
    function ajaxUpload(){
        var formdata=new FormData( );
        if(!$("#ajaxFile").val()){
            return;
        }
        formdata.append("key1","efg");
        formdata.append("file" , $("#ajaxFile")[0].files[0]);//获取文件法
        $.ajax({
            url: '/upload3.html',
            type: 'POST',
            data: formdata,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (json) {
               // alert(json)
                var data=JSON.parse(json)
                $("#pic").attr("src",data.url);
            }
        });

    }
</script>
</body>
</html>
