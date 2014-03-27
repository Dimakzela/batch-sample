'use strict';

angular.module('siteApp')
  .controller('PresupuestosCtrl', function ($scope, $http) {
		var loadBudget = function () {
      $http.get('/batch-sample/budget.json').success(function (data) {
        $scope.budget = data;
      });
    };

    jQuery(".dropzone").dropzone({
      success: function () {
        loadBudget();
      }
    });

    loadBudget();

  });
