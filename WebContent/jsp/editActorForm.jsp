<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Edit Actor</h1>
<form:form method="POST" action="/TestWebProject/editSave" class="form-horizontal">
	<form:hidden path="actorId" />
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
			<input type="submit" value="Edit Save" />
			<input type="button" onclick="location.href='/TestWebProject/viewActorList'" value="Cancel" />
		</div>
	</div>
</form:form>