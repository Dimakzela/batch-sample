'use strict';

angular.module('siteApp', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ngRoute'
])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/detalle', {
        templateUrl: 'views/detalle.html',
        controller: 'DetalleCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
