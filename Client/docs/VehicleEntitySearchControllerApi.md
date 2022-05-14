# VehicleEntitySearchControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeSearchVehicleentityGet**](VehicleEntitySearchControllerApi.md#executeSearchVehicleentityGet) | **GET** /vehicleEntities/search/findByNumberPlateContaining | 


<a name="executeSearchVehicleentityGet"></a>
# **executeSearchVehicleentityGet**
> CollectionModelEntityModelVehicleEntity executeSearchVehicleentityGet(numberPlate)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VehicleEntitySearchControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    VehicleEntitySearchControllerApi apiInstance = new VehicleEntitySearchControllerApi(defaultClient);
    String numberPlate = "numberPlate_example"; // String | 
    try {
      CollectionModelEntityModelVehicleEntity result = apiInstance.executeSearchVehicleentityGet(numberPlate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VehicleEntitySearchControllerApi#executeSearchVehicleentityGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberPlate** | **String**|  | [optional]

### Return type

[**CollectionModelEntityModelVehicleEntity**](CollectionModelEntityModelVehicleEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |

