<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<div class="row">
	<div class="span2">
		<%@ include file="/WEB-INF/jsp/include/menu.jsp"%>
	</div>	
	
	<div class="row">

		<br>
		<form:form commandName="customer"  action="saveCustomer" method="post" cssClass="form-horizontal">
		<div class="span4">
				<div>
					<h4>${customerAction}</h4>
				</div>
				<div>
					<label class="control-label" for="input01">Nombre&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="firstName" maxlength="30"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Apellidos&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="lastName" maxlength="50"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Sexo&nbsp;:&nbsp;</label>
					<div>
						<label>
							<form:select path="sexType.typeCode">
							   <form:options items="${sexTypeList}" itemValue="typeCode" itemLabel="description"/>
							</form:select>
						</label>
					</div>
				</div>
				
				<div>
					<label class="control-label" for="input01">Tipo de cliente&nbsp;:&nbsp;</label>
					<div>
						<label>
							<form:select path="customerType.typeCode">
							   <form:options items="${customerTypeList}" itemValue="typeCode" itemLabel="description"/>
							</form:select>
						</label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">DNI/RUC&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="dniRucNumber" maxlength="20"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Empresa&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="companyName" maxlength="60"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Telefono&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="phone" maxlength="15"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Celular&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="cell" maxlength="15"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Correo&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="email" maxlength="50"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Pagina&nbsp;:&nbsp;</label>
					<div>
						<label><form:input path="websity" maxlength="70"/></label>
					</div>
				</div>
				<div>
					<label class="control-label" for="input01">Estado&nbsp;:&nbsp;</label>
					<div>
						<label>
							<form:select path="customerStatus.typeCode">
								<form:options items="${customerStatusList}" itemValue="typeCode" itemLabel="description"/>
							</form:select>
						</label>
					</div>
				</div>
				<div align="center">
					<input type="submit" class="btn btn-primary" value=" Guardar " name="Guardar" />
					<br> <br>
				</div>
			</div>

		</form:form>

	</div>	
</div>	



