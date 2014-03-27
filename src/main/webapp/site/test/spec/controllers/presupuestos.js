'use strict';

describe('Controller: PresupuestosCtrl', function () {

  // load the controller's module
  beforeEach(module('siteApp'));

  var PresupuestosCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    PresupuestosCtrl = $controller('PresupuestosCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
