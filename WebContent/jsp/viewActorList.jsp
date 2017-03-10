<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Actors List</h1>
<div>
<table id="actorTable" class="table table-striped table-hover table-condensed table-bordered">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Last Update</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="actor" items="${actorList}">
			<tr>
				<td>${actor.actorId}</td>
				<td>${actor.firstName}</td>
				<td>${actor.lastName}</td>
				<td>${actor.lastUpdate}</td>
				<td><a href="editActor/${actor.actorId}">Edit</a></td>
				<td><a href="deleteActor/${actor.actorId}" onclick="javascript:confirmForChanges();">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br />
<a href="insertActorForm">Add New Actor</a>
</div>
<script>
	function confirmForChanges (){
		var r= confirm("Do you want to proceed");
		if (r == true) {
     		document.getElementById('submitButton').action = "/root/submitAction.do";
     		document.getElementById('submitButton').submit();
    		alert("Your changes have been saved");
		}if (r ==false){
       		alert("changes not saved")
       	}
	}
</script>