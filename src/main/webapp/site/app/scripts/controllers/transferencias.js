'use strict';

angular.module('siteApp')
  .controller('TransferenciasCtrl', function ($scope, $http) {
	var loadTransfers = function () {
      $http.get('/batch-sample/transfer.json').success(function (data) {
        $scope.transfers = data;
      });
    };

    jQuery(".dropzone").dropzone({
      success: function () {
        loadTransfers();
      }
    });

    loadTransfers();
  });
