<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="frame" uri="/WEB-INF/tld/framework.tld"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>login</title>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="stylesheet" href="/resource/login/css/login.css" />
</head>

<body>
<form id="form" action="${ctx}/login" method="post">
	<div class="sm_loginmain">
		<div class="sm_logo"></div>
		<div class="sm_loginuser">
			<div class="sm_loginusericon"></div>
			<input type="text" name="username" class="sm_logininput">
		</div>
		<div class="sm_loginpassword">
			<div class="sm_loginpasswordicon"></div>
			<input type="password" name="password" class="sm_logininput">
		</div>
		<div style="color: #ff0000;">
			${error}
			</div>
		<div class="sm_loginbuttn"><a id="btnSubmit" ><img src="/resource/login/images/loginbutton.jpg" onclick="submit()" width="100%" height="40" alt=""/></a></div>
	</div>
	<div class="sm_bgline"></div>
</form>
<script type="text/javascript">
	function submit(){
		form.submit();
	}
</script>
</body>
</html>
