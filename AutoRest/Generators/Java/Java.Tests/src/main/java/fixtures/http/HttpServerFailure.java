/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.http.models.Error;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.HTTP;
import retrofit.http.POST;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpServerFailure.
 */
public interface HttpServerFailure {
    /**
     * The interface defining all the services for HttpServerFailure to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpServerFailureService {
        @HEAD("/http/failure/server/501")
        Call<Void> head501();

        @GET("/http/failure/server/501")
        Call<ResponseBody> get501();

        @POST("/http/failure/server/505")
        Call<ResponseBody> post505(@Body Boolean booleanValue);

        @HTTP(path = "/http/failure/server/505", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete505(@Body Boolean booleanValue);

    }
    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> head501() throws ServiceException, IOException;

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head501Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> get501() throws ServiceException, IOException;

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get501Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> post505(Boolean booleanValue) throws ServiceException, IOException;

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Error object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Error> delete505(Boolean booleanValue) throws ServiceException, IOException;

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

}
