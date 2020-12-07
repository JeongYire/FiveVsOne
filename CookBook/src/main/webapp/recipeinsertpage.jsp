<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

</style>
<body>
레시피 제목 <br> <textarea name = "레시피 제목" style="resize: none" rows = "4" cols = "50" 
		wrap ="virtual">레시피의 제목을 입력해주세요!</textarea>
<br/>
요리 소개 <br> <textarea name = "요리 소개" style="resize: none" rows = "12" cols = "50" 
		wrap ="virtual">요리에 대한 간략한 소개를 해주세요!</textarea>
	<form>
카테고리	<select name = "country" size = "1">
			<option value = "country">국가별</option>
			<option value = "ko">한식</option>
			<option value = "we">양식</option>
			<option value = "ja">일식</option>
			<option value = "etc">기타</option>
		</select>
		<select name = "taste" size = "1">
			<option value = "taste">취향별</option>
			<option value = "sweet">단맛</option>
			<option value = "salty">짠맛</option>
			<option value = "sour">신맛</option>
			<option value = "spicy">매운맛</option>
			<option value = "simple">담백한맛</option>
		</select>
		<select name = "age" size = "1">
			<option value = "age">연령별</option>
			<option value = "infants">영유아</option>
			<option value = "teenager">청소년</option>
			<option value = "adult">성인</option>
			<option value = "middle-aged">중장년층 이상</option>
		</select>
		<select name = "kinds" size = "1">
			<option value = "kinds">종류별</option>
			<option value = "mainDish">메인요리</option>
			<option value = "mainSideDish">메인반찬</option>
			<option value = "sideDish">밑반찬</option>
			<option value = "dessert">디저트</option>
			<option value = "etc">기타</option>
		</select>
		<br/>
요리정보	<select name = "Personnel" size = "1">
			<option value = "Personnel">인원</option>
			<option value = "f1p">1인분</option>
			<option value = "f2p">2인분</option>
			<option value = "f3p">3인분</option>
			<option value = "f4p">4인분</option>
			<option value = "f5p">5인분</option>
			<option value = "Mf6p">6인분 이상</option>
		</select>
		<select name = "time" size = "1">
			<option value = "time">시간</option>
			<option value = "10mW">10분 이내</option>
			<option value = "20mW">20분 이내</option>
			<option value = "30mW">30분 이내</option>
			<option value = "60mW">60분 이내</option>
			<option value = "90mW">90분 이내</option>
			<option value = "M120m">120분 이상</option>
		</select>
		<select name = "Difficulty" size = "1">
			<option value = "Difficulty">난이도</option>
			<option value = "llevel">초급</option>
			<option value = "mlelevel">중급</option>
			<option value = "hlevel">고급</option>
			<option value = "glevel">신</option>
		</select>
	</form>
</body>
</html>