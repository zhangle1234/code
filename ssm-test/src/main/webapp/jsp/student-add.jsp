<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>Title</title>
    <script type="text/javascript" src="js/jquery_3.4.1.js"></script>
    <script type="text/javascript">

        $(function () {

            $(":button").click(function () {

                $.ajax({
                    url:"student/insert",
                    type:"get",
                    data:{
                        "name":$("input:first").val(),
                        "age":$("input:eq(1)").val()

                    },
                    dataType:"text",
                    success:function (result) {
                        alert(result)

                    }

                })

            })
        })

    </script>
</head>
<body>

          <table border="1" align="center">

              <tr>
                 <td> 学生姓名<input type="text" name="name"></td>
              </tr>

              <tr>
                 <td> 学生年龄<input type="text" name="age"></td>
              </tr>

              <tr>
                  <td><input type="button" value="注册" ></td>
              </tr>
          </table>
</body>
</html>