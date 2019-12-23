<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
<form enctype="multipart/form-data" action="user/login" method="post">
    <table>
        <tr>
            <td><label for="txtname">账号：</label></td>
            <td><input type="text" id="username" name="username" /></td>
        </tr>
        <tr>
            <td><label for="txtpswd">密码：</label></td>
            <td><input type="text" id="password" name="password" /></td>
        </tr>
        <tr>
            <td colspan=2>
                <input type="reset" />
                <input type="submit" />
            </td>
        </tr>
    </table>
</form> 
</body>
</html>