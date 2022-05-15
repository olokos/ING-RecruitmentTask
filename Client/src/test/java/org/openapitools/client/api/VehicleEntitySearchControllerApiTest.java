/*
 * Spring Boot Rest Server API
 * Made by Aleksander Kos for purposes of recruitment to ING
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * Contact: olokos@wp.pl
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CollectionModelEntityModelVehicleEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehicleEntitySearchControllerApi
 */
@Ignore
public class VehicleEntitySearchControllerApiTest {

    private final VehicleEntitySearchControllerApi api = new VehicleEntitySearchControllerApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeSearchVehicleentityGetTest() throws ApiException {
        String numberPlate = null;
        CollectionModelEntityModelVehicleEntity response = api.executeSearchVehicleentityGet(numberPlate);

        // TODO: test validations
    }
    
}
