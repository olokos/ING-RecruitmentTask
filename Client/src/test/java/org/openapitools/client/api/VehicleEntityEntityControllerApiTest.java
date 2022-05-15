/*
 * Spring Boot Rest Server API
 * Made by olokos for purposes of recruitment to ING
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
import org.openapitools.client.model.EntityModelVehicleEntity;
import org.openapitools.client.model.PagedModelEntityModelVehicleEntity;
import org.openapitools.client.model.VehicleEntityRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehicleEntityEntityControllerApi
 */
@Ignore
public class VehicleEntityEntityControllerApiTest {

    private final VehicleEntityEntityControllerApi api = new VehicleEntityEntityControllerApi();

    
    /**
     * 
     *
     * delete-vehicleentity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemResourceVehicleentityDeleteTest() throws ApiException {
        String id = null;
                api.deleteItemResourceVehicleentityDelete(id);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * get-vehicleentity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionResourceVehicleentityGet1Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
                PagedModelEntityModelVehicleEntity response = api.getCollectionResourceVehicleentityGet1(page, size, sort);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * get-vehicleentity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemResourceVehicleentityGetTest() throws ApiException {
        String id = null;
                EntityModelVehicleEntity response = api.getItemResourceVehicleentityGet(id);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * patch-vehicleentity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchItemResourceVehicleentityPatchTest() throws ApiException {
        String id = null;
        VehicleEntityRequestBody vehicleEntityRequestBody = null;
                EntityModelVehicleEntity response = api.patchItemResourceVehicleentityPatch(id, vehicleEntityRequestBody);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * create-vehicleentity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCollectionResourceVehicleentityPostTest() throws ApiException {
        VehicleEntityRequestBody vehicleEntityRequestBody = null;
                EntityModelVehicleEntity response = api.postCollectionResourceVehicleentityPost(vehicleEntityRequestBody);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * update-vehicleentity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putItemResourceVehicleentityPutTest() throws ApiException {
        String id = null;
        VehicleEntityRequestBody vehicleEntityRequestBody = null;
                EntityModelVehicleEntity response = api.putItemResourceVehicleentityPut(id, vehicleEntityRequestBody);
        // TODO: test validations
    }
    
}
