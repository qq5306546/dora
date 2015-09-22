'use strict';

var app = angular.module('app', ['ui.router']);

app.config(function ($stateProvider, $urlRouterProvider) {
     $urlRouterProvider.when('', '/home');
     $stateProvider
        .state('home', {
            url: '/home',
            templateUrl: 'home'
        })
        .state('test', {
            url:'/test',
            templateUrl: 'test'
        });
});
