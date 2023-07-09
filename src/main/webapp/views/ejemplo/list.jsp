<%--
 * list.jsp
 *
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<!-- Listing grid -->


	
	<!-- Action links -->
	<display:table pagesize="5" class="displaytag" keepStatus="true"

	name="ejemplo" requestURI="${requestURI}" id="row">

	

	<spring:message code="ejemplo.nombre" var="nombreHeader" />

	<display:column property="nombre" title="${nombreHeader}" sortable="true" />



	<spring:message code="ejemplo.fecha" var="fechaHeader" />

	<display:column property="fecha" title="${fechaHeader}" sortable="true" />



	<spring:message code="ejemplo.numero" var="numeroHeader" />

	<display:column property="numero" title="${numeroHeader}" sortable="false" />

	

	<spring:message code="ejemplo.precio" var="precioHeader" />

	<display:column property="precio" title="${precioHeader}" sortable="false" />



</display:table>
	