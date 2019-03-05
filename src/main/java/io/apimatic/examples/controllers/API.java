/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.apimatic.examples.*;
import io.apimatic.examples.models.*;
import io.apimatic.examples.exceptions.*;
import io.apimatic.examples.http.client.HttpClient;
import io.apimatic.examples.http.client.HttpContext;
import io.apimatic.examples.http.request.HttpRequest;
import io.apimatic.examples.http.response.HttpResponse;
import io.apimatic.examples.http.response.HttpStringResponse;
import io.apimatic.examples.http.client.APICallBack;
import io.apimatic.examples.controllers.syncwrapper.APICallBackCatcher;

public class API extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static API instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the API class 
     */
    public static API getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new API();
                }
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    body    Required parameter: Example: 
     * @param    cacheControl    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @param    postmanToken    Required parameter: Example: 
     * @return    Returns the DynamicResponse response from the API call 
     */
    public DynamicResponse new(
                final NewRequest body,
                final String cacheControl,
                final String contentType,
                final String postmanToken
    ) throws Throwable {
        APICallBackCatcher<DynamicResponse> callback = new APICallBackCatcher<DynamicResponse>();
        newAsync(body, cacheControl, contentType, postmanToken, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    body    Required parameter: Example: 
     * @param    cacheControl    Required parameter: Example: 
     * @param    contentType    Required parameter: Example: 
     * @param    postmanToken    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void newAsync(
                final NewRequest body,
                final String cacheControl,
                final String contentType,
                final String postmanToken,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/1.1/test.php");

                    //validate and preprocess url
                    String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                    //load all headers for the outgoing API request
                    Map<String, String> _headers = new HashMap<String, String>();
                    _headers.put("cache-control", cacheControl);
                    _headers.put("content-type", contentType);
                    _headers.put("postman-token", postmanToken);
                    _headers.put("gfdsfkl", Configuration.gfdsfkl);
                    _headers.put("dsfsdf", Configuration.dsfsdf);

                    _headers.put("user-agent", BaseController.userAgent);


                    //prepare and invoke the API call request to fetch the response
                    _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body),
                            Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                    //invoke the callback before request if its not null
                    if (getHttpCallBack() != null) {
                        getHttpCallBack().OnBeforeRequest(_request);
                    }

                } catch (Throwable e) {
                    callBack.onFailure(null, e);
                    return;
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null) {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
 {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}