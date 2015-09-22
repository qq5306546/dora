'use strict';

var app = angular.module('app', ['ngRoute', 'ngResource']);
app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {  
    $routeProvider
        .when('/home', { templateUrl: 'admin/home', controller: 'HomeController' })
        .when('/test', { templateUrl: 'admin/test' })
        .otherwise({ redirectTo: '/home' });
    
    $locationProvider.html5Mode(true);
}]);