package org.openapitools.client;

import org.openapitools.client.api.ProfileControllerApi;
import org.openapitools.client.api.VehiclesControllerApi;
import org.openapitools.client.model.VehicleEntity;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ApiClient vehicleClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
        VehiclesControllerApi VehiclesControllerApiInstance = new VehiclesControllerApi(vehicleClient);
        try {
//            String result = apiInstance.descriptor111();
            List<VehicleEntity> result = VehiclesControllerApiInstance.getVehicles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfileControllerApi#descriptor111");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}