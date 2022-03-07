<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aula 2</title>
</head>
<body>

	<h1>Aula 2<h1>
	
	<div align="center">
		<form action="viagem" method="post">
			<p><b>Pesquisa Viagens</b><p>
			<table>
				<tr>
					<td>
						<input type="number" min="0" step="1" id="codigo" name="codigo"
						placeholder="Código viagem" required="required">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" id="enviar" name="enviar" value="Enviar">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<br/>
	<div align="center">
		<c:if test="${not empty viagem.placaOnibus}">
			<table border = "1">
				<thead>
					<tr>
						<th><b>Codigo</b></th>
						<th><b>Placa</b></th>
						<th><b>Motorista</b></th>
						<th><b>Hora Saída</b></th>
						<th><b>Hora Chegada</b></th>
						<th><b>Partida</b></th>
						<th><b>Destino</b></th>
						<tr>
				<thead>
				<tbody>
						<tr>
							<td><c:out value="${viagem.id}"></c:out>
							<td><c:out value="${viagem.placaOnibus}"></c:out>
							<td><c:out value="${onibus.nomeMotorista}"></c:out>
							<td><c:out value="${viagem.horaSaida}"></c:out>
							<td><c:out value="${viagem.horaChegada}"></c:out>
							<td><c:out value="${viagem.partida}"></c:out>
							<td><c:out value="${viagem.destino}"></c:out>	
						</td>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty viagem.placaOnibus}">
			<h1>Não existem viagens com esse código!</h1>
		</c:if>
	</div>
	
	
	
	
</body>
</html>