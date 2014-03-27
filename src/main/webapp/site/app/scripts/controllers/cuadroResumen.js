'use strict';

angular.module('siteApp').controller('CuadroresumenCtrl', function ($scope $http) {
	
	var loadResume = function () {
  	$http.get('/batch-sample/cuadroResumen.json').success(function (data) {
    	$scope.resume = data;
    });
  };

  loadResume();
});
