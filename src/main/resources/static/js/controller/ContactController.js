/**
 * Created by Administrator on 2016/4/14.
 */
app.controller('contactController', function($scope, $rootScope, $location, $http){
    function initialize() {
        $scope.contacts = [];
        $scope.keyword = '';
        $scope.page = 0;
        $scope.selectedIds = [];
        $scope.newId = -1;
        //$scope.searchContacts(0);

    }
});