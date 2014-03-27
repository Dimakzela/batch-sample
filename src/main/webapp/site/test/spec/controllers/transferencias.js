'use strict';

describe('Controller: TransferenciasCtrl', function () {

  // load the controller's module
  beforeEach(module('siteApp'));

  var TransferenciasCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    TransferenciasCtrl = $controller('TransferenciasCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
