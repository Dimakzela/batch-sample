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
      .when('/presupuestos', {
        templateUrl: 'views/presupuestos.html',
        controller: 'PresupuestosCtrl'
      })
      .when('/transferencias', {
        templateUrl: 'views/transferencias.html',
        controller: 'TransferenciasCtrl'
      })
      .when('/cuadroResumen', {
        templateUrl: 'views/cuadroResumen.html',
        controller: 'CuadroresumenCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
