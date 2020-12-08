<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 페이지</title>
<link rel="stylesheet" type="text/css" href="/resources/css/default.css" />
<style>

	.mainMenuList{
		display: inline-block;
		width : 10%;
		margin : 0 10px;
		background-color: red;
		
	}
	#subMenuListBox{
		display: block;
	}
	
	#subMenuListBox>.subMenuList{
		width : 10%;
		display : inline-block; 
		float : left;
		margin : 0 10px;
		background-color: green;
		
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$.getJSON("/resources/js/menuJson/menuList.json", function(data){
			console.log(data + " 주메뉴 개수 : " + data.length);
			let mainMenuListHTML = '';
			let subMenuListHTML = '';
			for(let i = 0; i < data.length ; i++){
				mainMenuListHTML +='<li class="mainMenuList">'+ data[i].mainCategory+'</li>';
				subMenuListHTML += '<ul class="subMenuList">';
				for(let j=0; j < data[i].subList.length; j++){
//					console.log(data[i].linkInfo[j], data[i].pathBase[j]);
					subMenuListHTML +='<li><a href="' +data[i].pathBase +data[i].linkInfo[j] + '">' + data[i].subList[j] + '</a></li>';
				}
				subMenuListHTML +='</ul>';
				console.log()
			}
			$('#mainMenuListBox').append(mainMenuListHTML);
			$('#subMenuListBox').append(subMenuListHTML);
		});
		
 		
/*		$('#mainMenuListBox').mouseover( function(){
			$('#subMenuListBox').css({"display" : "block"});
		});
		$('#mainMenuListBox').mouseout( function(){
			$('#subMenuListBox').css({"display" : "none"});
		});*/

	});
	
	// (li{주메뉴$}+ul>li{리스트$}*4)*5
</script>
</head>
<body>

<div id="menuBox">
	<div id="mainMenuListBox">
		
	</div>
	<div id="subMenuListBox">
		
	</div>
</div>


</body>
</html>