<div ng-app="">
	<h1>Hello World!</h1>
		<p>Name: <input type="text" ng-model="name"></p>
		Hello <span ng-bind="name"></span>
		<hr/>
	<a href="insertActorForm" class="btn btn-primary">Add Actor</a>  
	<a href="viewActorList" class="btn btn-primary">View Actors</a>  
	<div id="crunchifyMessage"></div>
</div>