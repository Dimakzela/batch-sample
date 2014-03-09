'use strict';

angular.module('siteApp')
  .controller('DetalleCtrl', function ($scope, $http) {
    var loadSummary = function () {
      $http.get('/batch-sample/data.json').success(function (data) {
        $scope.summary = data;
      });
    };

    jQuery(".dropzone").dropzone({
      success: function () {
        loadSummary();
      }
    });

    loadSummary();
  });
