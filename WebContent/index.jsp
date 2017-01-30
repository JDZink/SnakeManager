<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/indexStyles.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Snake Gallery</title>
</head>
<body class="background">
	<h1>Snake Gallery</h1>
		<div class="imageContainer">
			<c:forEach var='snake' items='${allSnakes}'>
				<div class="flexitem">
					<a href="lookup.do?view=snake&id=${snake.name}"><img
						src="img/${snake.name}.jpg" alt="${snake.name}"> </a>
					<p>NAme: ${snake.name}
					<br> Gender: ${snake.gender}
					<br>Vis Genetics: ${snake.visibleGenetics}
					<br>HetGenetics${snake.hetGenetics}
					<br>Location: ${snake.location}
					<br>MoreInfo: <a href="http://www.worldofballpythons.com/morphs/?q=${snake.visibleGenetics}" >WorldOfBalls Genetics</a>
					</p>
				</div>
			</c:forEach>
		</div> 
</body>
</html>
