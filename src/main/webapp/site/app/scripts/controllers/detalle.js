'use strict';

angular.module('siteApp')
  .controller('DetalleCtrl', function ($scope, $http) {
    var loadDetail = function () {
      $http.get('/batch-sample/detail.json').success(function (data) {
        $scope.detail = data;
      });
    };

    jQuery(".dropzone").dropzone({
      success: function () {
        loadDetail();
      }
    });

    loadDetail();
  });
