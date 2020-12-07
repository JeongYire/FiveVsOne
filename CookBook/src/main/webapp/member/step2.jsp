<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script>
function check_pwd(){
	var password = document.getElementById("memPwd").value;
	  if(document.getElementById("memPwd").value !='' && document.getElementById("ckmemPwd").value!=''){
          if(document.getElementById("memPwd").value==document.getElementById("ckmemPwd").value){
              document.getElementById("ckpw").innerHTML="비밀번호가 일치합니다."
              document.getElementById("ckpw").style.color="black";
              }
          else{
              document.getElementById("ckpw").innerHTML="비밀번호가 일치하지 않습니다.";
              document.getElementById("ckpw").style.color="red";
              }
          }
	  }
</script>
<title>COOKBOOK</title>
<style>
	.btn{
		background-color: #4CAF50; /*색변경*/
		border: none;
		color: white;
		padding: 15px 32px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 16px;
		margin: 4px 2px;
		cursor: pointer;
	}
	.joinbox{
		margin: auto;
		width: 300px;
		height: 350px;
		padding: 20px;
		text-align: center;
	}
	.formbox{
		
	}
</style>
</head>
<body>
<h1>회원가입</h1>
<div class="joinbox">
	<form action="member/step3" method="post">
		<div class="formbox">
			<input type="text" name="memId"  placeholder="아이디(8-30자이내)" value="${memberVO.memId }" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/> <!-- style수정하셔도 됩니다 -->
			<input type="password" name="memPwd" id="memPwd" value="${memberVO.memPwd }" placeholder="비밀번호(8-30자이내)" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/> 
			<input type="password" name="ckmemPwd" id="ckmemPwd" placeholder="비밀번호 확인" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
			<span id="ckpw"></span><br/> <!-- 비밀번호일치체크 -->
			<input type="text" name="memName" value="${memberVO.memName }" placeholder="이름" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
			<input type="text" name="memNickName" value="${memberVO.memNickName }" placeholder="닉네임" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/> 
			<input type="email" name="memEmail" value="${memberVO.memEmail }" placeholder="이메일" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
			<input type="checkbox" name="memGender" value="남자" />남&nbsp;&nbsp;
			<input type="checkbox" name="memGender" value="여자" />여<br/>
		</div><br/><br/>
		<button class="btn" type="submit">회원가입</button>
		<!-- 뒤로가기를 만들고 싶다면 추가 -->
	</form>
</div>
</body>
</html>