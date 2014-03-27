'use strict';

describe('Controller: CuadroresumenCtrl', function () {

  // load the controller's module
  beforeEach(module('siteApp'));

  var CuadroresumenCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    CuadroresumenCtrl = $controller('CuadroresumenCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
