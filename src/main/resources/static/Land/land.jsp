<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<title>登录注册</title>
	<script src="../js/jquery.min.js"></script>
	<script src="../bootstrap3/js/bootstrap.js"></script>
	<link  rel="styleSheet" href="../bootstrap3/css/bootstrap.css"> 
	<link href="../js/toastr.min.css" rel="stylesheet" />
	<script src="../js/toastr.min.js"></script>
</head>
<style>
#myModal {
         position: absolute;
        top: 50%;
        left: 50%;
        transform: translateX(-50%) translateY(-50%);
    }
#adduser {
         position: absolute;
        top: 50%;
        left: 50%;
        transform: translateX(-50%) translateY(-50%);
    }
</style>
<body>
<div class="modal fade" id="myModal" style="height: 600px"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					登陆
				</h4>
			</div>
			<div class="modal-body">
			<form role="form" id="userfrom"  enctype="multipart/form-data" > 
			<center><img  class="img-circle image-responsive"  src="../img/timg (8).jpg" width="100px" height="100px"></center>
				 <br>
				  <div class="input-group">
				 <span class="input-group-addon">账号：</span>
				 <input type="text" class="form-control" name="account"  placeholder="请输入用户名">
				 </div>
				 <br>
				 <div class="input-group">
				  <span class="input-group-addon">密码：</span>
				 <input type="text" class="form-control"  name="password" placeholder="请输入密码" >
                 </div>
                 <br>
				 <div class="input-group input-group-lg">
				  <span class="input-group-addon">验证码：</span>
				 <input type="text" class="form-control" name="img" placeholder="请输入验证码"  >
				 <span class="input-group-btn">
                        <button class="btn btn-default" type="button"><img  onclick="this.src='../verificationCode?tim='+new Date().getTime()" style="margin: -8px 0px 0px 0px"  src="../verificationCode"></button>
                 </span>
                 </div>
                 </form>
                 <br>
			</div>
			<div class="modal-footer">
				<button type="button" onclick="userloag()"  class="btn btn-default" >登陆
				</button>
				<button type="button" class="btn btn-default" onclick="addusermodal()" >注册
				</button>
			</div>
		</div>
	</div>
</div>
<!-- 注册 -->
<div class="modal fade" id="adduser" style="height: 600px"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="addmyModalLabel">
					注册
				</h4>
			</div>
			<div class="modal-body">
			<form role="form" id="adduserfrom"  enctype="multipart/form-data" > 
			<center><img  class="img-circle image-responsive"  src="13" width="100px" height="100px"></center>
				 <br>
				  <div class="input-group">
				 <span class="input-group-addon">用户名：</span>
				 <input type="text" class="form-control" id="name"  placeholder="请输入用户名">
				 </div>
				 <br>
				  <div class="input-group">
				 <span class="input-group-addon">账号：</span>
				 <input type="text" class="form-control" id="account"  placeholder="请输入账号">
				 </div>
				 <br>
				 <div class="input-group">
				  <span class="input-group-addon">密码：</span>
				 <input type="text" class="form-control"  id="password" placeholder="请输入密码" >
                 </div>
                 <br>
                 <div class="input-group">
				  <span class="input-group-addon">密码：</span>
				 <input type="text" class="form-control" id="password1" placeholder="确认密码" >
                 </div>
                 </form>
                 <br>
			</div>
			<div class="modal-footer">
				<button type="button" onclick="initmodal()"  class="btn btn-default" >返回登陆
				</button>
				<button type="button" class="btn btn-default" onclick="adduser()" >完成注册
				</button>
			</div>
		</div>
	</div>
</div>
</body>
<script type="text/javascript">
initmodal();
function initmodal(){
		$('#adduser').modal('hide');
		$("#myModal").modal("show");
}
function addusermodal(){
		$("#myModal").modal("hide");
		$("#adduser").modal("show");
}
function userloag(){
	var data=$('#userfrom').serialize();
	var submitData=decodeURIComponent(data,true);
		$.ajax({
		    url:'../book/userloag.do',
		    type:'post',
		    data:submitData,
		    dataType:'json',
		    success:function(data){
		    	if (data==1) {
		    		toastr.error("验证码不正确!");
		    		return;
				}
		    	if (data==2) {
		    		toastr.error("账号不存在!");
		    		return;
				}
		    	if (data==3) {
		    		toastr.error("密码不正确!");
		    		return;
				}
		    	if (data==0) {
		    		window.location.href="../src/list.do";
				}
		    }
		})
}
function adduser(){
	var password = $("#password").val();
	var password1 = $("#password1").val();
	var account = $("#account").val();
	var name = $("#name").val();
	if (password1!=password||password==null||password1==null||account==null||password==""||password1==""||account=="") {
		toastr.error("信息填写不正确!");
		return;
	}
		$.ajax({
		    url:'../book/adduser.do',
		    type:'post',
		    data:{
		    	account:account,
		    	password:password,
		    	name:name
		    },
		    dataType:'json',
		    success:function(data){
		    	if (data) {
		    		$('#adduser').modal('hide');
					$("#myModal").modal("show");
				}else{
					toastr.error("注册失败!");
				}
		    	
		    }
		})
}







</script>
</html>