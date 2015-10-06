<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<script>
	function newCustomer() {
		document.customer.submit();
	}
	function editCustomer(id) {
		document.customer.id.value = id;
		document.customer.action.value = "editCustomer";
		document.customer.submit();
	}
	function deleteCustomer(id) {
		document.customerDelete.id.value = id;
		document.customerDelete.submit();
	}
</script>

<div class="row">
	<div class="span2">
		<%@ include file="/WEB-INF/jsp/include/menu.jsp"%>
	</div>	
	
	<div class="modal-body">
		Lista de clientes:
		<div class="pull-right">
		<a href="#" class="btn btn-primary" onclick="javascript:newCustomer()">Registrar cliente</a>
		</div>	

		<br>
		<display:table name="${customers}" id="item" requestURI="/dashboard" class="table">
			<display:column title="Nombre y Apellidos">
				<a href="#" onclick="javascript:editCustomer('<c:out value="${item.id}"></c:out>');">
					<c:out value="${item.name}"/>
				</a>
			</display:column>
			<display:column title="Tipo Empresa" property="customerType.description" />
			<display:column title="DNI/RUC" property="dniRucNumber" />
			<display:column title="Empresa" property="companyName" />
			<display:column title="accion">
				<a href="#" onclick="javascript:deleteCustomer('<c:out value="${item.id}"></c:out>');">
					<c:out value="Eliminar"/>
				</a>
			</display:column>
		</display:table>

	</div>	
</div>	


<form method="post" action="<%=request.getContextPath()%>/home/customerForm" name="customer">
	<input type = "hidden" id="id" name="id"/>
	<input type = "hidden" id="action" name="action"/>
</form>

<form method="post" action="<%=request.getContextPath()%>/home/deleteCustomer" name="customerDelete">
	<input type = "hidden" id="id" name="id"/>
</form>