/**
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

angular.module('APIMATICCalculatorLib')
    .factory('SimpleCalculator', ['$q', 'Configuration', 'HttpClient', 'APIHelper', 'BaseController', SimpleCalculator
    ]);

    function SimpleCalculator($q, Configuration, HttpClient, APIHelper, BaseController) {
        return {
            /**
             * Calculates the expression using the specified operation.
             *
             * @param {OperationType} operation The operator to apply on the variables
             * @param {double} x The LHS value
             * @param {double} y The RHS value
             *
             * @return {promise<Precision>}
             */
            newEndpointItIs: function (operation, x, y) {

                //Create promise to return
                var _deffered = $q.defer();
                
                //prepare query string for API call
                var _baseUri = Configuration.BASEURI;
                var _queryBuilder = _baseUri + '/{operation}';
                
                // Process template parameters
                _queryBuilder = APIHelper.appendUrlWithTemplateParameters(_queryBuilder, {
                    'operation': (operation !== null) ? operation : null
                });

                // Process query parameters
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, {
                    'x': x,
                    'y': y
                });

                //validate and preprocess url
                var _queryUrl = APIHelper.cleanUrl(_queryBuilder);
                
                // prepare headers
                var _headers = {
                    'gfdsfkl': Configuration.gfdsfkl,
                    'dsfsdf': Configuration.dsfsdf
                };

                // prepare and invoke the API call request to fetch the response
                var _config = {
                    method: 'GET',
                    queryUrl: _queryUrl,
                    headers: _headers,
                    username: Configuration.basicAuthUserName,
                    password: Configuration.basicAuthPassword,
                };
                
                var _response = new HttpClient(_config);
                
                //process response
                _response.then(function success(_result) {
                    var _strResult =_result.body;
                    _result.body = parseFloat(_strResult);
                    _deffered.resolve(_result);
                }, function error(_result){
                    // Error handling for custom HTTP status codes
                    _deffered.reject(APIHelper.appendContext({
                        errorMessage:'HTTP Response Not OK',
                        errorCode: _result.code,
                        errorResponse: _result.message
                    }, _result.getContext()));
                });
                
                return _deffered.promise;
            }
        };
    }

}(angular));
