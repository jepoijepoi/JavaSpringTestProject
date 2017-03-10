<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Add New Actor</h1>
<form:form method="POST" action="save" class="form-horizontal">
	<div class="control-group">
		<label class="control-label" for="inputFirstName">First Name</label>
		<div class="controls">
			<form:input path="firstName" type="text" id="inputFirstName" placeholder="First Name" />
		</div>
	</div>
	<div class="control-group">
		<label class="control-label" for="inputLastName">Last Name</label>
		<div class="controls">
			<form:input path="lastName" type="text" id="inputLastName" placeholder="Last Name" />
		</div>
	</div>
	<div class="control-group">
		<div class="controls">
			<br/>
			<input type="submit" value="Save" />
			<input type="button" onclick="location.href='/TestWebProject/viewActor'" value="Cancel" />
		</div>
	</div>
</form:form>