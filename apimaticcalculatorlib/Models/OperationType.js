/**
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';

angular.module('APIMATICCalculatorLib')
    .factory('OperationType', [OperationTypeModel]);

    function OperationTypeModel() {
        return {
            //Represents the sum operator
            SUM: 'SUM',
    
            //Represents the subtract operator
            SUBTRACT: 'SUBTRACT',
    
            //Represents the multiply operator
            MULTIPLY: 'MULTIPLY',
    
            //Represents the divide operator
            DIVIDE: 'DIVIDE'
        };
    }

}(angular));
